package com.itheima.note;

/**
 * 强制类型转换
 * 强制转换，会导致数据丢失，大的转给小的
 * 浮点型数据强制转成整型的话，直接截断小数部分，保留整数
 */
public class Note8 {
    public static void main(String[] args) {
        int a = 11;
        byte a1 = (byte) a; // 强制转换， 快捷键：alt + enter


        int i1 = 500;
        byte i2 = (byte) i1;
        System.out.println(i2);

        double count = 55.55;
        int count2 = (int) count;
        System.out.println(count2); // 55
    }
}
