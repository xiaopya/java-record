package com.d4_singleInstance;

/**
 * 饿汉式单例设计模式的写法：需要满足3个条件
 * 1.构造器必须私有
 * 2.需要定义一个变量记住这个类
 * 3.需要提供一个类方法返回当前对象
 */
public class DesignPattern {
    /*  */
    private static DesignPattern s = new DesignPattern();

    /* 构造器必须私有 */
    private DesignPattern(){

    }

    /* 定义一个类方法，把对象返回出去 */
    public static DesignPattern getObject(){
        return s;
    }
}
