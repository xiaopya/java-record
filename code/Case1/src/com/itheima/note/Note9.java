package com.itheima.note;

/**
 * 基本算数符的使用
 * 注意点：
 * 1. / 如果俩个整数做除法，其结果一定是整数，因为最高类型是整数，如果想保留小数那就需要在被除数上面 * 1.0
 * 2. + 加号运算遇到能算就算，不能算的就是拼接
 */
public class Note9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(5 / 2); // 结果：2   -》 俩个整数相除的结果还是整数
        System.out.println(5.0 / 2); // 结果：2.5

        int i =  5;
        int j =  2;
        System.out.println(1.0 * i / j); // 2.5


        int x = 10;
        int x1 = 22;
        String y = "abc";
        System.out.println(x + y); // 10abc
        System.out.println(x +x1); // 32
        System.out.println(x +x1 + y); // 32abc
        System.out.println(x + 'a'); // 107
    }
}
