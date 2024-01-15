package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 时间转换
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        d.setTime(time);

        System.out.println(d);

        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simple.format(new Date()));

        String time1 = "2024-01-15 22:23:48";
        SimpleDateFormat simple1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date ss = simple1.parse(time1);
        System.out.println(ss);
    }
}
