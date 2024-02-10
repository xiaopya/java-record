package com.itxiaopy.aop;

import com.alibaba.fastjson2.JSONObject;
import com.auth0.jwt.interfaces.Claim;
import com.itxiaopy.mapper.OperateLogMapper;
import com.itxiaopy.pojo.OperateLog;
import com.itxiaopy.utils.Jwt;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.aop
 * @className: LogAspect
 * @author: cyl
 * @description: TODO aop操作日志记录
 * @date: 2024/2/9 12:44
 * @version: 1.0
 */
@Slf4j
@Component
@Aspect
public class LogAspect {

    private final HttpServletRequest request;
    private final OperateLogMapper operateLogMapper;

    @Autowired
    public LogAspect(HttpServletRequest request, OperateLogMapper operateLogMapper) {
        this.request = request;
        this.operateLogMapper = operateLogMapper;
    }

    @Around("execution(* com.itxiaopy.controller.*.*(..))")
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {

        // 获取用户的信息
        String token = request.getHeader("token");
        Map<String, Claim> claims = null;
        Integer operateUser = null;
        if (token == null) {
            log.info("token is null");
        }else{
            claims = Jwt.decodeJwtToken(token);
            operateUser = claims.get("id").asInt();
        }

        LocalDateTime operateTime = LocalDateTime.now();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String methodParams = Arrays.toString(args);

        long begin = System.currentTimeMillis();

        // 调用原始方法运行
        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        String returnValue = JSONObject.toJSONString(result);

        long costTime = end - begin;

        // 记录操作日志
        OperateLog operateLog = new OperateLog(null, operateUser, operateTime, className, methodName, methodParams, returnValue, costTime);
        operateLogMapper.insert(operateLog);

        log.info("aop记录操作日志：{}", operateLog);
        return result;
    }

}

