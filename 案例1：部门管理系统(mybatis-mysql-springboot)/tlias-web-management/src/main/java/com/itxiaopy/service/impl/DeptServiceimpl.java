package com.itxiaopy.service.impl;

import com.itxiaopy.mapper.DeptMapper;
import com.itxiaopy.pojo.Dept;
import com.itxiaopy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.service.impl
 * @className: DeptServiceimpl
 * @author: cyl
 * @description: TODO 功能实现类
 * @date: 2024/2/1 20:33
 * @version: 1.0
 */
@Service
public class DeptServiceimpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }

    @Override
    public Dept get(Integer id) {
        return deptMapper.getDeptById(id);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}
