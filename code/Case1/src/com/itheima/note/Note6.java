package com.itheima.note;

/**
 * 类型转换机制
 * 表达式中，最终结果类型由表达式中的最高数据类型决定的
 */
public class Note6 {
    public static void main(String[] args) {
        byte a = 1;
        short a1 = 11;
        int b = 2;
        long c = 4;
        long count = a + b + c; // 这里运算后的结果就是long类型，所以定义long类型是不会出现错误，但是定义int或者是其他就会出现报错
        System.out.println(count); // 7

        double count1 = a + b + 1.1; // 这里的1.1是最高的数据类型，随便写的一个小数默认就是double类型，double类型是8个字节，所以需要定义double类型即可
        System.out.println(count1);

        int count3 = a + a1; // 这里不是定义short类型，因为在表达式中 byte short char 这三个都是直接转换成int类型参与计算的
        System.out.println(count3);
    }
}
