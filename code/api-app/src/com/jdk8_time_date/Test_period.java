package com.jdk8_time_date;

import java.time.LocalDate;
import java.time.Period;

/**
 * 可以用于计算两个LocalDate对象相差的年数、月数、天数。
 */
public class Test_period {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2029,8,10);
        LocalDate end = LocalDate.of(2034,12,5);

        // 创建Period对象
        Period period = Period.between(start,end);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
