package com.jdk8_time_date;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 人麻了，用的时候再查
 * 可以用于计算两个时间对象相差的天数、小时数、分数、秒数、纳秒数，支持LocalTime、LocalDateTime、Instant等时间。
 */
public class Test_Duration {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2024,11,23,11,23,4);
        LocalDateTime end = LocalDateTime.of(2025,10,13,18,23,4);

        // 得到 Duration 对象
        Duration duration = Duration.between(start,end);

        System.out.println(duration.toDays()); // 间隔多少天
        System.out.println(duration.toHours()); // 间隔多少小时
        System.out.println(duration.toMinutes()); // 间隔多少分
        System.out.println(duration.toSeconds()); // 间隔多少秒
        System.out.println(duration.toMillis()); // 间隔多少毫秒
        System.out.println(duration.toNanos()); // 间隔多少纳秒
    }
}
