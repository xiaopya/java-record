package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: 案例1：部门管理系统（mysql,mybatis,springboot）
 * @package: com.itxiaopy.pojo
 * @className: Result
 * @author: cyl
 * @description: TODO 接口返回格式
 * @date: 2024/2/1 20:47
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success() {
        return new Result(1, "success", null);
    }
    public static Result success(Object data){
        return new Result(1, "success", data);
    }
    public static Result error(String msg) {
        return new Result(0, msg, null);
    }
}
