package com.itxiaopy.service;

import com.itxiaopy.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cyl
 */
@Service
public interface DeptService {
    /**
     * 查询全部部门随
     * @return
     */
    List<Dept> list();

    /**
     * 删除部门
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);

    /**
     * 部门详情
     * @param id
     * @return
     */
    Dept get(Integer id);

    /**
     * 部门数据更新
     * @param dept
     */
    void update(Dept dept);
}
