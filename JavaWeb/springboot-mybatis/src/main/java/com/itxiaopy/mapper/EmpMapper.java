package com.itxiaopy.mapper;

import com.itxiaopy.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author cyl
 */
@Mapper
public interface EmpMapper {
    /* sql：xml形式 */
    void delete(List<Integer> ids);
    void update(Emp emp);
    List<Emp> list(Emp emp);

    /* sql：注解形式 */
    @Options(useGeneratedKeys = true,keyProperty = "id") // 插入数据后，将生成的id返回出来
    @Insert("insert into tb_emp(username, name, gender, image, job, entry_time, create_time, update_time) values(#{username},#{name},#{gender},#{image},#{job},#{entryTime},#{createTime},#{updateTime})")
    void insert(Emp emp);
//    @Update("update tb_emp set username = #{username},name = #{name} where id = #{id}")
//    void update(Emp emp);
    @Select("select id, username, password, name, gender, image, job, entry_time, create_time, update_time from tb_emp where id = #{id}")
    Emp getEmpById(Integer id);
}
