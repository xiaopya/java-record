package com.itxiaopy.controller;

import com.itxiaopy.pojo.Address;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: java学习记录
 * @package: com.itxiaopy.controller
 * @className: RequestController
 * @author: cyl
 * @description: TODO 接口测试文档：https://apifox.com/apidoc/shared-7c99abb3-f54d-4493-b543-ab544e48e379
 * @date: 2024/1/24 19:09
 * @version: 1.0
 */
@RestController
public class RequestController {
    /**
     * 1．原始方式获取请求参数 (了解就好)
     * Controller方法形参中声明HttpServletRequest对象
     * 调用对象的getParameter（参数名）
     * 2．SpringBoot中接收简单参数 (下面用到的就是)
     * 请求参数名与方法形参变量名相同
     * 会自动进行类型转换
     * 3.@RequestParam注解
     * 方法形参名称与请求参数名称不匹配，通过该注解完成映射
     * 该注解的required属性默认是true，代表请求参数必须传递
     */
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name", required = false) String userName, Integer age) {
        System.out.println(userName + ":" + age);
        return "ok";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "ok";
    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "ok";
    }

    /* 数组 */
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }

    /* 集合 */
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }

    /* 日期时间参数 */
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "ok";
    }

    /* json参数 */
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    /* 路径参数 */
    @RequestMapping("/pathParam/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name) {
        System.out.println(id + "===" + name);
        return "ok:" + id + name;
    }

    /* 返回对象 */
//    @RequestMapping("/listAddr")
//    public Result listAddr() {
//        Address res= new Address("安徽","安庆");
//        return Result.success(res);
//    }

    /* 返回集合 */
    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> res= new ArrayList<>();
        res.add(new Address("安徽","安庆"));
        res.add(new Address("江西","南昌"));
        return Result.success(res);
    }
}
