package com.itxiaopy.mapper;

import com.itxiaopy.pojo.User;
import org.apache.ibatis.annotations.Delete;
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

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
}
