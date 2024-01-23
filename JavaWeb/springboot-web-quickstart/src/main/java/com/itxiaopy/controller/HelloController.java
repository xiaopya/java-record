package com.itxiaopy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: java学习记录
 * @package: com.itxiaopy.controller
 * @className: HelloController
 * @author: cyl
 * @description: TODO springboot入门
 * @date: 2024/1/23 20:57
 * @version: 1.0
 */

// 请求处理类 @RestController
@RestController
public class HelloController {
    @RequestMapping("/helloMessage")
    public String helloMessage(){
        System.out.println("hello ~~");
        return "hello springboot";
    }
}
