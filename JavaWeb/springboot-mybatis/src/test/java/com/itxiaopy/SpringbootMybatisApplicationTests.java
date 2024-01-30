package com.itxiaopy;

import com.itxiaopy.mapper.UserMapper;
import com.itxiaopy.pojo.User;
import net.bytebuddy.utility.nullability.AlwaysNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUsers() {
        List<User> userList = userMapper.list();
        userList.forEach(System.out::println);
    }

}
