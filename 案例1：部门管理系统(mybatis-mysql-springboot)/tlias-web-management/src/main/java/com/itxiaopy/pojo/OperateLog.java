package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.pojo
 * @className: OperateLog
 * @author: cyl
 * @description: TODO 操作日志实体类
 * @date: 2024/2/9 12:45
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperateLog {
    private Integer id;
    private Integer operateUser;
    private LocalDateTime operationTime;
    private String className;
    private String methodName;
    private String methodParams;
    private String returnValue;
    private long costTime;
}
