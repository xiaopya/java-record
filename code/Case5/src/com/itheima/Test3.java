package com.itheima;

import java.util.Scanner;

/**
 * 选手打分 [0-100] 之间的整数，去掉最高分和最低分，算出剩余分数的平均分
 */
public class Test3 {
    public static void main(String[] args) {
        double temp = averageScore(6);
        System.out.println(temp);
    }

    /**
     * 分析：
     * 1. 定义一个动态初始化的数组，用于记录评委的分数。
     * 2. 拿到所有的分数，遍历找出最大值，最小值。
     * 3. (总分数 - 最大值 - 最小值) / (评委人数 - 2)
     */
    public static double averageScore(int n){
        // 支持用户手动输入分数
        Scanner sc = new Scanner(System.in);
        // 定义一个数组存储评委的分数
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请" + (i+1) + "号评委的输入自己的分数");
            int s = sc.nextInt();
            score[i] = s;
        }

        // 拿到所有分数，找出最大值和最小值，计算出总成绩减去最大值和最小值，最后在计算出平均分数
        // 定义最大值和最小值
        double sum = 0;
        double max = score[0];
        double min = score[0];
        for (int i = 0; i < score.length; i++) {
            int _score = score[i];
            // 求和
            sum += _score;
            // 求最大值
            if(max < _score){
                max = _score;
            }
            // 求最小值
            if(min > _score ){
                min = _score;
            }
        }

        // 计算出平均值
        return (sum - max - min) / (n - 2 );
    }

}
