package com.jdk8_time_date;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 主要用到的日期api，介绍
 * 没写全，用的时候看文档
 */
public class Test_LocalTime {
    public static void main(String[] args) {
        //0、获取本地时间对象
        LocalTime lt = LocalTime.now();// 时分秒纳秒不可变的
        System.out.println(lt);

        // 1、获取时间中的信息
        int hour = lt.getHour();//时
        int minute = lt.getMinute();//分
        int second = lt.getSecond();//秒
        int nano = lt.getNano();//纳秒

        // 2、修改时间：withHour、withMinute、withSecond、withNano
        LocalTime lt3 = lt.withHour(10);
        LocalTime lt4 = lt.withMinute(10);
        LocalTime lt5 = lt.withSecond(10);
        LocalTime lt6 = lt.withNano(10);

        //3、加多少：plusHours、plusMinutes、plusSeconds、plusNanos
        LocalTime lt7 = lt.plusHours(10);
        LocalTime lt8 = lt.plusMinutes(10);
        LocalTime lt9 = lt.plusSeconds(10);
        LocalTime lt10 = lt.plusNanos(10);

    }
}
