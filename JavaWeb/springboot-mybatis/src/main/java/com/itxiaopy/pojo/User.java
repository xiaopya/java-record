package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: java学习记录
 * @package: com.itxiaopy.pojo
 * @className: User
 * @author: cyl
 * @description: TODO 用户表信息
 * @date: 2024/1/30 21:01
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private short age;
    private short gender;
    private  String phone;
}
