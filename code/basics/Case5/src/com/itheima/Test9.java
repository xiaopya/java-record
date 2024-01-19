package com.itheima;

/**
 * 三角形
 */
public class Test9 {
    public static void main(String[] args) {
        /*
                   *
                  ***
                 *****
                *******
               *********
         */
        // 第一行 4空格（n-1） 1*（2*i-1）
        // 第二行 3空格（n-2） 3*
        // 第三行 2空格（n-3） 5*
        // 第四行 1空格（n-4） 7*
        // 第五行 0空格（n-5） 9*
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // 先处理空格的输出 (n-i)
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            // 处理*的输出 (2*i-1)
            for (int j = 1; j <= (2*i-1); j++) {
//                System.out.print("*");
                System.out.print(j%2==0? " " : "*");
            }
            // 输出换行
            System.out.println();
        }
    }
}
