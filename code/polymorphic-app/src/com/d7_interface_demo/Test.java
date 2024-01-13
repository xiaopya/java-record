package com.d7_interface_demo;

/**
 * 面向接口的Demo
 * 设计俩个方案：
 * 1. 输出全班学生信息；能输出全部学生的平均分
 * 2. 输出全部学生信息（包含男女生人数）；输出全部学生的平均分（要求去掉最高分和最低分）
 * 要求是需要灵活的切换该系统，这个时候就需要面向接口去实现
 */
public class Test {
    public static void main(String[] args) {
        ClassManage c = new ClassManage();
        c.allStudentInfo();
        c.allStudentAverage();

    }
}
