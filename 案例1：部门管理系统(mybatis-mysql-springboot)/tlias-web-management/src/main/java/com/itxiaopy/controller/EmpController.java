package com.itxiaopy.controller;

import com.itxiaopy.pojo.Emp;
import com.itxiaopy.pojo.PageBean;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.controller
 * @className: EmpController
 * @author: cyl
 * @description: TODO 员工管理
 * @date: 2024/2/1 20:31
 * @version: 1.0
 */
@Slf4j
@RequestMapping("/emp")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/list")
    public Result list(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "2") Integer pageSize,
            String name,
            Integer gender,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startTime,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endTime
    ) {
        log.info("用户列表,参数：{},{},{},{},{},{}}", pageNum, pageSize, name, gender, startTime, endTime);
        PageBean data = empService.list(pageNum, pageSize, name, gender, startTime, endTime);
        return Result.success(data);
    }

    @PostMapping("/delete/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("删除用户,参数:{}",ids);
        empService.delete(ids);
        return Result.success();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Emp emp){
        empService.update(emp);
        return Result.success();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Emp emp){
        empService.add(emp);
        return Result.success();
    }
}
