package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.pojo
 * @className: Emp
 * @author: cyl
 * @description: TODO 用户
 * @date: 2024/2/1 20:33
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private String image;
    private Integer job;
    private LocalDate entryTime;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
