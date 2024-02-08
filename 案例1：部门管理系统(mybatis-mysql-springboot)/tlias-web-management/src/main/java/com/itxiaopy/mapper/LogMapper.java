package com.itxiaopy.mapper;

import com.itxiaopy.pojo.LogTb;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author cyl
 */
@Mapper
public interface LogMapper {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Insert("insert into log(create_time,log) values(#{createTime},#{log})")
    void insert(LogTb logTb);
}
