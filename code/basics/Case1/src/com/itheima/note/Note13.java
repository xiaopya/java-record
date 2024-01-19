package com.itheima.note;

/**
 * 逻辑运算符
 * && 和 || 运算的时候，当左边的为true右边就不会执行，如果是单 | 和 & 俩边都会执行
 */
public class Note13 {
    public static void main(String[] args) {
        // 需求：要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8的
        // 前后条件必须同时满足
        double size = 6.95;
        int storage = 8;
        boolean phone = size >= 6.95 && storage >= 8;
        System.out.println(phone);

        // 需求2：要求手机要么满足尺寸大于等于6.95，要么内存必须大于等于8
        // 前后条件必须满足一个
        double size2 = 6.95;
        int storage2 = 8;
        boolean phone2 = size2 >= 6.95 || storage2 >=8;
        System.out.println(phone2);

        // !取反
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(2>1)); // false

        // ^ 前后条件相同就会返回false，前后条件不同就会返回true
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
    }
}
