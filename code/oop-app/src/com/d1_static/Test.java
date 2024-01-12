package com.d1_static;

/**
 * static 修饰符
 */
public class Test {
    public static void main(String[] args) {
        // 类变量是可以直接访问的
        // 类变量是贡献的，在类创建的时候，他只会在堆内存中存储一份，所以他们访问的都是同一份地址
        StaticDemo.name = "测试";
        StaticDemo sss1 = new StaticDemo();
        StaticDemo sss2 = new StaticDemo();
        sss1.name = "测试1";
        sss2.name = "测试3";
        System.out.println(sss1.name); // 测试3
        System.out.println(sss2.name); // 测试3

        // 实例变量需要通过对象访问
        // new了俩个对象分别赋值，他们的结果是不一样的，这就是实例变量不被共享，都是指向不同地址
        StaticDemo ss1 = new StaticDemo();
        StaticDemo ss2 = new StaticDemo();
        ss1.money = 100;
        ss2.money = 120;
        System.out.println(ss1.money); // 100
        System.out.println(ss2.money); // 120
    }
}
