package com.itheima.note;

/**
 * 三元运算符
 */
public class Note14 {
    public static void main(String[] args) {
        double score = 59.5;
        String result = score >= 60 ? "考试通过": "成绩不合格";
        System.out.println(result);

        // 找出3个数的较大值，并输出.
        int a = 10;
        int b = 20;
        int c = 30;
        int max = a > b ? a : b > c ? b : c;
        System.out.println(max);
    }
}
