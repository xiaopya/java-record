package com.d3_abstract;

/**
 * 抽象类：
 *
 */
public abstract class People {
    private String name;

    /* 抽象类是不需要写大括号的，定义了之后，子类要是继承的话，就必须要重写这个方法 */
    public abstract void control();
}
