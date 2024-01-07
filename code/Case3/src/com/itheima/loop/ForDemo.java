package com.itheima.loop;

/**
 * for循环
 */
public class ForDemo {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 0; i < count; i++) {
            System.out.println("hello world");
        }

        // 奇数和
        int sum = 0;
        int fixed = 100;
//        for (int i = 1; i <= fixed; i+=2) {
//            sum += i;
//        }
        for (int i = 1; i <= fixed; i += 2) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
