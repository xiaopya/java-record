package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.pojo
 * @className: PageBean
 * @author: cyl
 * @description: TODO 分页结果封装
 * @date: 2024/2/3 14:12
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private Long total;
    private List<?> data;
}
