package com.itxiaopy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.pojo
 * @className: LogTb
 * @author: cyl
 * @description: TODO 日志
 * @date: 2024/2/8 20:59
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogTb {
    private Integer id;
    private LocalDateTime createTime;
    private String log;
}
