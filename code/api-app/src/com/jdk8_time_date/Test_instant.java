package com.jdk8_time_date;

import java.time.Instant;

/**
 *
 */
public class Test_instant {
    public static void main(String[] args) {

        Instant now = Instant.now();
        //总秒数
        long second = now.getEpochSecond();
        System.out.println(second);

        // 不够1的纳秒
        long nano = now.getNano();
        System.out.println(nano);
    }
}
