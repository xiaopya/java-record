package com.itxiaopy;

import com.itxiaopy.mapper.EmpMapper;
import com.itxiaopy.mapper.UserMapper;
import com.itxiaopy.pojo.Emp;
import com.itxiaopy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 单元测试
 */
@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testListUsers() {
        List<User> userList = userMapper.list();
        userList.forEach(System.out::println);
    }

    @Test
    public void testDeleteUser() {
        userMapper.delete(1);
    }

    @Test
    public void testInsertEmp() {
        Emp emp = new Emp();
        emp.setUsername("username122333");
        emp.setName("张三11222");
        emp.setGender((short) 1);
        emp.setImage("6.jpg");
        emp.setJob((short) 2);
        emp.setEntryTime(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);

        // 获取生成的id
        System.out.println(emp.getId());
    }

    @Test
    public void testUpdateEmp() {
        Emp emp = new Emp();
        emp.setId(197);
        emp.setUsername("cjb122");
        emp.setName("陈佳宝1333");
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    @Test
    public void testGetById() {
        Emp temp = empMapper.getEmpById(190);
        System.out.println(temp);
    }

    @Test
    public void testDeleteEmp() {
        List<Integer> list = Arrays.asList(188, 189);
        empMapper.delete(list);
    }

    @Test
    public void testListEmp() {
        Emp emp = new Emp();
        emp.setName("佳宝");
        emp.setEntryTime(LocalDate.parse("2022-01-01"));
        empMapper.list(emp);
    }
}
