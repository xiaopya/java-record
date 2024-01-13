package com.d7_interface_demo;

import java.util.ArrayList;

/**
 * 这里第一套方案
 */
public class StudentInterfaceImpl1 implements StudentInterface {

    /**
     * 输出全部学生信息
     */
    @Override
    public void allStudentInfo(ArrayList<Student> studentList) {
        System.out.println("==全部学生信息如下==");
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(0);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore() + "。");
        }
        System.out.println("------------------------------");
    }


    /**
     * 输出全部学生的平均分
     */
    @Override
    public void allStudentAverage(ArrayList<Student> studentList) {
        System.out.println("==全部学生的平均分如下==");
        double average = 0.0;
        for (int i = 0; i < studentList.size(); i++) {
            average += studentList.get(0).getScore();
        }
        System.out.println("平均分：" + average / studentList.size());
    }
}
