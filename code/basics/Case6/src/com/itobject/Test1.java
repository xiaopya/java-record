package com.itobject;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.chinese = 123;
        s1.maths = 111;
        s1.printAverageScore();
        s1.printTotalScore();

        Student s2 = new Student();
        s2.name = "小红";
        s2.chinese = 140;
        s2.maths = 60;
        s2.printAverageScore();
        s2.printTotalScore();
    }
}
