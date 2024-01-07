package com.javabean;

/**
 * 实体类
 * 1. 成员变量必须都是私有的，并对每个变量提供get，set方法
 * 2. 必须要为类提供一个无参数构造器
 * 3. 通常是用来保存数据的java类，如果需要对数据进行操作就需要新建一个专门用来操作数据的类
 */
public class Student {
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
