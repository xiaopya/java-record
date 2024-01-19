package com.itobject;

/**
 * this 最多是用来解决对象中命名冲突的问题
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.score  = 100;
        s1.printThis();
        s1.printThisScore(90);
    }
}
