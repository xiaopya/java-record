package com.itxiaopy.mapper;

import com.itxiaopy.pojo.ExceptionLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author cyl
 */
@Mapper
public interface ExceptionLogMapper {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Insert("insert into log(create_time,description) values(#{createTime},#{description})")
    void insert(ExceptionLog description);
}
