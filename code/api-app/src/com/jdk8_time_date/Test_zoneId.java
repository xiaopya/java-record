package com.jdk8_time_date;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 时区
 * 看文档（人麻了）
 */
public class Test_zoneId {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

    }
}
