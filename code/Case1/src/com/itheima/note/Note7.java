package com.itheima.note;

/**
 * 基本数据类型
 */
public class Note7 {
    public static void main(String[] args) {
        // byte short int long
        byte a = 127;
        short b = 32767;
        // 整型
        int c = 4444444; // 默认类型

        // 注意：随便写的一个整形字面量默认都是int类型，虽然没有超过long类型，但是超过了long类型
        // 要是希望随便写的整形字面量默认是long类型需要在后面增加一个 大写的 L
        long l = 241245125125L;

        // 注意：随便写一个小数，默认都是double类型
        // 要是希望随便写的整形字面量默认是float类型，需要在后面加上一个 f
        float f = 1.0F;
        double d = 1.0;
        double e = 1.4567;

        // 字符型
        char ch = 'a';
        char ch1 = '陈';
        char ch2 = '\u0000';

        // 布尔值
        boolean b1 = true;
        boolean b2 = false;

        // 引用类型
        String name = "张三";
        System.out.println(name);




















        // 基本数据类型
        // 整型
        byte x = 11; // 1 字节
        short x1 = 11111; // 2字节
        int x2 = 1111111111; // 4字节 默认类型
        long x3 = 1111111111111111111L; // 8字节 不加上L 默认就是int类型，加上L，默认就是long类型，报错是因为，该数字超过了int类型（不加L的情况下），

        // 浮点数（小数）
        float x4 = 1.1F; // 4字节  需要加上f,不加f的话，默认就是double类型
        double x5 = 1.1211; // 8字节

        // 字符型
        char x6 = 'a';
        char x7 = 'x';

        // 布尔类型
        boolean x8 = true;
        boolean x9 = false;

        // 引用类型
        String name1 = "张三";
        String name2 = "张si";
        String name3 = "张wu";
        String name4 = "张liu";























        // 基础数据类型
        // 整型
        byte y1 = 111; // 1字节
        short y2 = 11111; // 2字节
        int y3 = 1111111111; // 4字节
        long y4 = 11111111111111111L; // 8字节
        // 浮点型
        float y5 = 1.1111F; // 4字节
        double y6 = 1.111111; // 8字节
        // 字符型
        char y7 = 'a';
        char y8 = '中';
        // 布尔类型
        boolean y9 = true;
        boolean y10 = false;
        // 引用类型
        String name10 = "陈永龙";
        String name11 = "程瑾慧是个大美女";
        System.out.println(name11);
    }
}
