package com.d5_extends;

public class StudentOperate {
    private static Student student = new Student();

    public static void setStudentInfo(){
        student.setName("张三");
        student.setAge(14);
        student.setSex('男');
    }
    public static void getStudentInfo(){
        System.out.println(student.getName());
    }
}
