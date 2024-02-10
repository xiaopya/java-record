package com.itxiaopy.controller;

import com.itxiaopy.anno.Log;
import com.itxiaopy.pojo.Dept;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.controller
 * @className: DeptController
 * @author: cyl
 * @description: TODO 部门管理
 * @date: 2024/2/1 20:31
 * @version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询部门列表数据
     * @return
     */
    @GetMapping("/list")
    public Result list(){
        List<Dept> deptList = deptService.list();
        log.info("部门列表：{}",deptList);
        return Result.success(deptList);
    }

    @Log
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除部门：{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @Log
    @PostMapping("/add")
    public Result add(@RequestBody Dept dept){
        log.info("添加部门：{}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/detail/{id}")
    public Result detail(@PathVariable Integer id){
        Dept data = deptService.get(id);
        log.info("部门详情：{}",data);
        return Result.success(data);
    }

    @Log
    @PostMapping("/update")
    public Result delete(@RequestBody Dept dept){
        log.info("更新部门数据：{}",dept);
        deptService.update(dept);
        return Result.success();
    }
}
