package com.itxiaopy.interceptor;

import com.alibaba.fastjson2.JSONObject;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.utils.Jwt;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Properties;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.interceptor
 * @className: LoginCheckInterceptor
 * @author: cyl
 * @description: TODO interceptor拦截器
 * @date: 2024/2/7 19:51
 * @version: 1.0
 */
@Slf4j
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {

    @Override // 在controller之前执行，true放行，false拦截
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {

        // 判断前端传过来的token是否为空
        String token = req.getHeader("token");
        if(!StringUtils.hasLength(token)){
            log.info("请求的token为空,{}",token);
            Result error = Result.error("not login");
            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return false;
        }

        // 解析token
        try {
            Jwt.decodeJwtToken(token);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("解析令牌失败，返回未登录的错误信息");
            Result error = Result.error("not login");
            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
