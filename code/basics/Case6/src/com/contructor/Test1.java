package com.contructor;

/**
 * 构造器：
 * 当new 一个类的时候，会默认调用一个无参数构造器
 */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("张三");
        System.out.println(s1.name);
    }
}
