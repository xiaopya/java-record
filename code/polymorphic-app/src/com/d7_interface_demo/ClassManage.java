package com.d7_interface_demo;

import java.util.ArrayList;

/**
 * 学生管理类
 */
public class ClassManage {
    private ArrayList<Student> studentList = new ArrayList<>();

    /**
     * 这个时候，俩套方案已经完成了，只需要切换 StudentInterfaceImpl2 方法就可以实现俩套方案的切换
     */
    // private StudentInterface studentInterface = new StudentInterfaceImpl1();
    private StudentInterface studentInterface = new StudentInterfaceImpl2();

    public ClassManage(){
        studentList.add(new Student("迪丽热巴",'女',99.5));
        studentList.add(new Student("古力娜扎",'女',66.5));
        studentList.add(new Student("牛皮吹大",'男',100));
        studentList.add(new Student("你好美呀",'女',58));
    }


    // 1. 输出全班学生信息；能输出全部学生的平均分
    public void allStudentInfo(){
        studentInterface.allStudentInfo(studentList);
    }

    // 2. 输出全部学生信息（包含男女生人数）；输出全部学生的平均分（要求去掉最高分和最低分）
    public void allStudentAverage(){
        studentInterface.allStudentAverage(studentList);
    }
}
