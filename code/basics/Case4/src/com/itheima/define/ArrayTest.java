package com.itheima.define;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // 评分
        // 有6个评委，存储他们各自的分数
        double[] judge = new double[6];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < judge.length; i++) {
            System.out.println("请输入该评委的分数 + " + (i + 1));
            double score = sc.nextDouble();
            judge[i] = score;
            sum += score;
        }

        System.out.println("总分数:" + sum);
        System.out.println("平均分:" + sum / judge.length);
    }
}
