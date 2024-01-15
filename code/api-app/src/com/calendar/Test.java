package com.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar 日历
 * 需求：指定月份的基础上增加一个月
 * public static Calendar getInstance()获取当前日历对象
 * public int get(int field)获取日历中的某个信息。
 * public final Date getTime()获取日期对象。
 * public long getTimeInMillis()获取时间毫秒值
 * public void set(int field,int value)修改日历的某个信息。
 * public void add(int field,int amount)为某个信息增加/减少指定的值
 */
public class Test {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 获取日历中某个时间
        int year = now.get(Calendar.YEAR);
        int dayYear = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(year);
        System.out.println(dayYear);

        // 拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        // 拿到毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 修改日历中的某个时间
        now.set(Calendar.DAY_OF_YEAR,100); // 修改为一年中的125天
        now.set(Calendar.MONTH,9); // 修改月份 从0开始记录的


        // 为某个信息增加或者减少
        now.add(Calendar.DAY_OF_YEAR,100);
        now.add(Calendar.MONTH,2);
        System.out.println(now);

    }
}
