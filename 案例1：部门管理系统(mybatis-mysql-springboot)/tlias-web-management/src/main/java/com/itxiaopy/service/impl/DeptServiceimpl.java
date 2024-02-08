package com.itxiaopy.service.impl;

import com.itxiaopy.mapper.DeptMapper;
import com.itxiaopy.mapper.EmpMapper;
import com.itxiaopy.mapper.LogMapper;
import com.itxiaopy.pojo.Dept;
import com.itxiaopy.pojo.LogTb;
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
    private LogMapper logMapper;

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
            LogTb logTb = new LogTb();
            logTb.setCreateTime(LocalDateTime.now());
            logTb.setLog("部门删除，id:" + id);
            log.info("log：{}",logTb);
            logMapper.insert(logTb);
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
