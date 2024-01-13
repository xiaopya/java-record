package com.d3_abstract;

/**
 * abstract抽象类
 * ：父类要是定义成抽象类，强制性让子类去做某件事情
 * ：抽象类就是强制性子类去重写某个方法，为了更好的去支持多态
 */
public class Test {
    public static void main(String[] args) {
        People s = new Student();
        s.control();
    }
}
