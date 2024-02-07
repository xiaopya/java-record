package com.itxiaopy.exception;

import com.itxiaopy.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.exception
 * @className: GlobalExceptionHandler
 * @author: cyl
 * @description: TODO 全局异常处理
 * @date: 2024/2/7 21:24
 * @version: 1.0
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    // 捕获所有的异常
    @ExceptionHandler(Exception.class)
    public Result ex(Exception ex){
        ex.printStackTrace();
        return Result.error("对不起，操作失败");
    }
}
