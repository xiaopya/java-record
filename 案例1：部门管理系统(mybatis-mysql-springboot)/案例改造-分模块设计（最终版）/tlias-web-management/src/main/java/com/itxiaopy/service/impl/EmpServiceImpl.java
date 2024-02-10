package com.itxiaopy.service.impl;

import com.itxiaopy.mapper.DeptMapper;
import com.itxiaopy.mapper.EmpMapper;
import com.itxiaopy.pojo.Emp;
import com.itxiaopy.pojo.PageBean;
import com.itxiaopy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.service.impl
 * @className: EmpServiceImpl
 * @author: cyl
 * @description: TODO 用户表实现类
 * @date: 2024/2/1 20:33
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean list(Integer pageNum, Integer pageSize, String name, Integer gender, LocalDate startTime, LocalDate endTime) {
        // 1. 获取总得列表数量
        Long total = empMapper.count();
        // 获取分页查询的结果
        Integer start = pageNum <= 0 ? 0 : (pageNum - 1) * pageSize;
        List<Emp> empList = empMapper.list(start, pageSize, name, gender, startTime, endTime);
        return new PageBean(total, empList);
    }

    @Override
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    @Override
    public void add(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.add(emp);
    }

    @Override
    public Emp login(Emp emp) {
        return empMapper.getUserByIdAndPassword(emp);
    }

}
