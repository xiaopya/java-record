package com.d2_final;

/**
 * final、常量
 */
public class Test {
    /* static final 一起修饰的成员变量 被称为常量，方便维护 */
    public static final String WEB_NAME = "网站名称";

    public static void main(String[] args) {
        System.out.println(WEB_NAME);
        System.out.println(WEB_NAME);
        System.out.println(WEB_NAME);
        System.out.println(WEB_NAME);

        final int a = 10;
        // a=11; final修饰的变量只能赋一次值，重新赋值的话会报错
    }

}


class A{
    public final void print(){}

}

class B extends A{
    // 当方便被final修饰的话，当前方法是不可以被重写的
    // public final void print(){}
}
