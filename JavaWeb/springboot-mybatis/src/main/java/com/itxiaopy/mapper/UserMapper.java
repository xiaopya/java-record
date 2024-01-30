package com.itxiaopy.mapper;

import com.itxiaopy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author cyl
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> list();
}
