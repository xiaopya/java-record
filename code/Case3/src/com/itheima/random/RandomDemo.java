package com.itheima.random;

import java.util.Random;

/**
 * 用random生成生成随机数
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1;i<=20;i++) {
//            int data = r.nextInt(10); // 0-9
//            int data1 = r.nextInt(10) + 1; // 1-10
            int data2 = r.nextInt(15) + 3; // 3-17
//            System.out.println(data);
//            System.out.println(data1);
            System.out.println(data2);
        }
    }
}
