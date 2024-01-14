package com.d6_enum;

/**
 * 枚举的用法
 * 1.下面的方法也可以用常量来解决
 * 2.用常量的话可以定义更多的类型等。。
 */

enum A{
    BOY,GIRL
}

public class Test {
    public static void main(String[] args) {
        // 这里传入一个操作，执行下面语句，
        // 定义枚举的话，这里只能选择枚举里面的常量，而不能想些什么就写什么，规范
        test1(A.GIRL);
    }

    public static void test1(A type){
        switch (type){
            case BOY:
                System.out.println("男生");
                break;
            case GIRL:
                System.out.println("女生");
                break;
        }
    }
}
