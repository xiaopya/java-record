package com.itxiaopy.config;

import com.itxiaopy.interceptor.LoginCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.config
 * @className: WebConfig
 * @author: cyl
 * @description: TODO
 * @date: 2024/2/7 19:59
 * @version: 1.0
 */
@Configuration // 配置类
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册loginCheckInterceptor拦截器，/** 拦截所有资源，并排除对 /login 的拦截
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
    }


}
