package com.itheima.note;

/**
 * 扩展运算符的使用
 * 计算底层逻辑：a = (a的类型)(a+b)  会把计算结果强制类型准换成a的类型
 */
public class Note11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        a+=b; // =》 a = (a的类型)(a+b);
        System.out.println(a);

        int c = 11;
        int d = 12;
        c-=d; // => c = (c的类型)(c-d);

        byte e = 40;
        byte f = 51;
        //e = e + f; // 这样的写法是有问题的，这种整型默认计算都是int类型，int类型赋给byte类型就肯定会报错
        e = (byte)(e+f);
        e += f; // 这样写就不会报错，因为等同于 e = (e的类型)(e+f); 他会把计算结果强制类型转换成e的类型也就是byte类型
    }
}
