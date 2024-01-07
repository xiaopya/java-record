package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 抢红包
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = {112, 99, 223, 4555};
        getRandomRedPackets(arr);
    }

    /**
     * 分析：
     * 1. 拿到数组，对其打乱
     * 2. 用户在抢红包的时候，按照数组的顺序一个个发出去即可
     */
    public static void getRandomRedPackets(int[] packets) {
        Random r = new Random();
        int length = packets.length;

        // 先将红包的顺序打乱
        for (int i = 0; i < length; i++) {
            int index = r.nextInt(length);
            int temp = packets[index];
            packets[index] = packets[i];
            packets[i] = temp;
        }

        // 用户输入之后，按照顺序，输出对应的数字即可
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < packets.length; i++) {
            System.out.println("请用户随机输入一串神秘代码获取随机红包：");
            sc.next();
            int temp = packets[i];
            System.out.println("恭喜你，中奖了！红包金额为：" + temp);
        }
        System.out.println("活动结束");
    }
}
