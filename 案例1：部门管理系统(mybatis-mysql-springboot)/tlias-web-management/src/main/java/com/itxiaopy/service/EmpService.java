package com.itxiaopy.service;

import com.itxiaopy.pojo.Emp;
import com.itxiaopy.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author cyl
 */
@Service
public interface EmpService {
    /**
     * 查询用户列表
     */
    PageBean list(Integer pageNum, Integer pageSize, String name, Integer gender, LocalDate startTime, LocalDate endTime);

    /**
     * 批量删除
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 更新数据
     * @param emp
     */
    void update(Emp emp);

    /**
     * 新增员工
     * @param emp
     */
    void add(Emp emp);

    /**
     * 用户登陆
     * @param emp
     */
    Emp login(Emp emp);
}
