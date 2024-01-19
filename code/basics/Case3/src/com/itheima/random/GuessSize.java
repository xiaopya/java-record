package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜大小
 */
public class GuessSize {
    public static void main(String[] args) {
        // 随机生成1-100之间的数据，做为中奖号码
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请你输入猜测的数值");
            int guess = sc.nextInt(); // 用户输入

            // 判断用户输入的数字和幸运数字大小的情况
            if(guess > luckNumber){
                System.out.println("大了");
            }else if(guess < luckNumber){
                System.out.println("小了");
            }else {
                System.out.println("恭喜你猜中了: " + luckNumber);
                break; // 结束循环
            }
        }
    }
}
