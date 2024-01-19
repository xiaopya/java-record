package com.itheima.loop;

/**
 * 循环嵌套
 */
public class LoopNestedDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("love");
            }
            System.out.println();
        }
    }
}
