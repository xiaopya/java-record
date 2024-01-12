package com.d4_singleInstance;

/**
 * 懒汉式单例模式设计模式的写法：需要满足3个条件
 * 1.构造器必须私有
 * 2.需要定义一个变量记住这个类
 * 3.需要提供一个类方法返回当前对象，但是要保证第一次才会创建一个对象后续都是用的第一次创建的对象
 */
public class DesignPattern1 {
    /*  */
    private static DesignPattern1 s;

    /* 构造器必须私有 */
    private DesignPattern1(){
 
    }

    /* 定义一个类方法，把对象返回出去 */
    public static DesignPattern1 getObject(){
        if(s == null){
            return s = new DesignPattern1();
        }
        return s;
    }
}
