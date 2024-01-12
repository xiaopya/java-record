package com.d4_singleInstance;

/**
 * 什么是设计模式：就是问题的最有解决方案
 * 单例模式
 * 好处是每次创建都只有一个对象，避免多次创建浪费内存
 */
public class Test {
    public static void main(String[] args) {

        // 以下是俩种单例模式的写法
        // 这个是一开始就创建了，
        DesignPattern d1 = DesignPattern.getObject();
        DesignPattern d2 = DesignPattern.getObject();
        System.out.println(d1 == d2); // true 他们的地址相同

        // 懒汉式单例模式设计模式
        // 这个模式是不去用他的时候是不会创建一个对象的，只有在需要用的时候，才会创建一次
        DesignPattern1 d3 = DesignPattern1.getObject();
        DesignPattern1 d4 = DesignPattern1.getObject();
        System.out.println(d3 == d4); // 他们的地址相同
    }
}
