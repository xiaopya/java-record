package com.jdk8_time_date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 时间格式化 JDK8
 */
public class Test_DateTimeFormatter {
    public static void main(String[] args) {
        // 创建一个日期格式化器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 对时间格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String rs = formatter.format(now);
        System.out.println(rs);

        // 格式化时间，另一个方案
        String rs2 = now.format(formatter);
        System.out.println(rs2);

        // 解析时间：解析时间一般使用LocalDateTime提供的解析方法解析
        String dataStr = "2024年01月11日 12:12:11";
        LocalDateTime ldt = LocalDateTime.parse(dataStr,formatter);
        System.out.println(ldt);
    }
}
