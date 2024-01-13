package com.d7_interface_demo;

import java.util.ArrayList;

/**
 * 这里实现第二套方案
 */
public class StudentInterfaceImpl2 implements StudentInterface {
    /**
     * 输出全部学生信息
     */
    @Override
    public void allStudentInfo(ArrayList<Student> studentList) {
        System.out.println("==全部学生信息如下（包含男女人数）==");
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(0);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore() + "。");
            if (s.getSex() == '男') {
                boyCount++;
            } else {
                girlCount++;
            }
        }
        System.out.println("男生人数：" + boyCount + "，女生人数：" + girlCount + "。");
        System.out.println("------------------------------");
    }


    /**
     * 输出全部学生的平均分
     */
    @Override
    public void allStudentAverage(ArrayList<Student> studentList) {
        System.out.println("==全部学生的平均分（去掉最高分和最低分）如下==");
        double max = studentList.get(0).getScore();
        double min = studentList.get(0).getScore();
        double average = 0.0;
        for (int i = 0; i < studentList.size(); i++) {
            Student ss = studentList.get(i);
            average += ss.getScore();
            if (max < ss.getScore()) {
                max = ss.getScore();
            }
            if (min > ss.getScore()) {
                min = ss.getScore();
            }
        }
        System.out.println("平均分：" + (average - max - min) / (studentList.size() - 2));
        System.out.println("最高分：" + max + "，最低分：" + min + "。");
    }
}
