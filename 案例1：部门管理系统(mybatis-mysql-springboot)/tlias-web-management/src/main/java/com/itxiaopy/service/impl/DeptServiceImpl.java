package com.itxiaopy.service.impl;

import com.itxiaopy.mapper.DeptMapper;
import com.itxiaopy.mapper.EmpMapper;
import com.itxiaopy.mapper.ExceptionLogMapper;
import com.itxiaopy.pojo.Dept;
import com.itxiaopy.pojo.ExceptionLog;
import com.itxiaopy.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.service.impl
 * @className: DeptServiceImpl
 * @author: cyl
 * @description: TODO 功能实现类
 * @date: 2024/2/1 20:33
 * @version: 1.0
 */
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private ExceptionLogMapper exceptionLogMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Transactional // 事务管理
    @Override
    public void delete(Integer id) {
        try {
            deptMapper.deleteById(id);
            int a = 0/0;
            empMapper.deleteByDeptId(id);
        } finally {
            System.out.println(999999);
            ExceptionLog exceptionLog = new ExceptionLog();
            exceptionLog.setCreateTime(LocalDateTime.now());
            exceptionLog.setDescription("部门删除，id:" + id);
            log.info("log：{}",exceptionLog);
            exceptionLogMapper.insert(exceptionLog);
        }
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
