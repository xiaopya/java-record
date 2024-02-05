package com.itxiaopy.mapper;

import com.itxiaopy.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

/**
 * @author cyl
 */
@Mapper
public interface EmpMapper {

    /**
     * 查询列表总得数量
     *
     * @return
     */
    @Select("select count(*) from emp")
    public Long count();

    /**
     * 查询用户列表(支持条件筛选,分页查询)
     */
    List<Emp> list(Integer pageNum, Integer pageSize, String name, Integer gender, LocalDate startTime, LocalDate endTime);

    /**
     * 批量删除用户
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 更新用户数据
     * @param emp
     */
    void update(Emp emp);

    /**
     * 添加用户数据
     * @param emp
     */
    void add(Emp emp);

    @Select("select * from emp where username = #{username} and password = #{password}")
    Emp getUserByIdAndPassword(Emp emp);
}