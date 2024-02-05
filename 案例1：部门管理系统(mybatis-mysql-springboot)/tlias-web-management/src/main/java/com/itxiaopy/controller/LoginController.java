package com.itxiaopy.controller;

import com.itxiaopy.pojo.Emp;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.service.EmpService;
import com.itxiaopy.utils.Jwt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.controller
 * @className: LoginController
 * @author: cyl
 * @description: TODO
 * @date: 2024/2/5 20:29
 * @version: 1.0
 */
@Slf4j
@RestController
public class LoginController {

    @Autowired
    private EmpService empService;

    /**
     * 用户登录
     * @param emp
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("用户登录，{}",emp);
        Emp e = empService.login(emp);
        if(e != null){
            Map<String,Object> map = new HashMap<>();
            map.put("id",e.getId());
            map.put("name",e.getName());
            map.put("username",e.getUsername());
            String token = Jwt.generateJwtToken(map.toString());
            return Result.success(token);
        }
        return Result.error("用户或密码错误");
    }
}
