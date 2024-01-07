package com.javabean;

/**
 * 实体类
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setScore(100);

        Operate o = new Operate(s);
        o.printScore(110);
    }
}
