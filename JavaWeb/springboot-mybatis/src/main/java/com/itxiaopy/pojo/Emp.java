package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @projectName: springboot-mybatis
 * @package: com.itxiaopy.pojo
 * @className: Emp
 * @author: cyl
 * @description: TODO tb_emp表信息
 * @date: 2024/1/31 19:28
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
    private short gender;
    private String image;
    private short job;
    private LocalDate entryTime;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
