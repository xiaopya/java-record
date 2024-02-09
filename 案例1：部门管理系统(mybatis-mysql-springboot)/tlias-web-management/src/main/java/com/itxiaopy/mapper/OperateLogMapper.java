package com.itxiaopy.mapper;

import com.itxiaopy.pojo.OperateLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cyl
 */
@Mapper
public interface OperateLogMapper {
    @Insert("insert into operate_log(operate_user, operate_name, class_name, method_name, method_params, return_value, cost_time) " +
            "values(#{operateUser},#{operateName},#{className},#{methodName},#{methodParams},#{returnValue},#{costTime}")
    void insert(OperateLog operateLog);
}
