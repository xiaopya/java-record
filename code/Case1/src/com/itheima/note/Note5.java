package com.itheima.note;

/**
 * 类型转换
 * 范围小的变量，可以字节赋值给范围大的变量
 */
public class Note5 {
    public static void main(String[] args) {
        // 目标：理解自动类型转换机制
        byte a = 12; // 1
        short c = a; // 2
        int b = c; // 4
        long  d = b; //8
        float f = b; //4
        double g = b; // 8
        char c1 = 'a'; // 2
        int c2 = c1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(c1);
        System.out.println(c2);
    }
}
