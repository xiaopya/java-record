package com.itxiaopy.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.utils
 * @className: AliOSSProperties
 * @author: cyl
 * @description: TODO 阿里云配置信息
 * @date: 2024/2/3 18:51
 * @version: 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class AliOSSProperties {
    private String endpoint;
    private String bucketName;
}
