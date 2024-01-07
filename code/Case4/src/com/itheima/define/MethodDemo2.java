package com.itheima.define;

/**
 * 参数传递
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        int a = 11;
        change(a);
        System.out.println(a); // 11
    }

    public static void change(int a){
        System.out.println(a); // 11
        a = 20;
        System.out.println(a); // 20
    }
}
