package com.itheima;

/**
 * 99乘法表
 */
public class Test8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
