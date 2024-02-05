package com.itxiaopy.filter;

import com.alibaba.fastjson2.JSONObject;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.utils.Jwt;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.filter
 * @className: LoginCheckFilter
 * @author: cyl
 * @description: TODO 拦截器
 * @date: 2024/2/5 20:54
 * @version: 1.0
 */

@Slf4j
@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println(111111);
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        // 判断当前url是否有login
        String url = req.getRequestURI();
        log.info("请求的url,{}",url);
        if(url.contains("login")){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        // 判断前端传过来的token是否为空
        String token = req.getHeader("token");
        if(!StringUtils.hasLength(token)){
            log.info("请求的token为空,{}",token);
            Result error = Result.error("not login");
            String notLogin = JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;
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
            return;
        }


        // 接口放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
