package com.itxiaopy.mapper;

import com.itxiaopy.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author cyl
 */
@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();

    /**
     * 根据id删除部门
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    @Insert("insert into dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    /**
     * 根据部门id查询数据
     * @param id
     * @return
     */
    @Select("select * from dept where id = #{id}")
    Dept getDeptById(Integer id);

    @Update("update dept set name = #{name} where id = #{id}")
    void update(Dept dept);
}
