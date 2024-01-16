package com.frame;

import com.bean.Appointment;
import com.bean.Department;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManager {
    /* 全部科室信息 */
    private ArrayList<Department> allDepartments = new ArrayList<>();
    /* 全部预约详情 */
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start(){
        while (true) {
            System.out.println("====欢迎进入仁爱医院信息管理系统====");
            System.out.println("1、科室管理-添加科室");
            System.out.println("2、科室管理-删除科室");
            System.out.println("3、科室管理-修改科室");
            System.out.println("4、医生管理-录入医生");
            System.out.println("5、医生管理-医生坐诊设置（可设置当天和未来6天的坐诊情况");
            System.out.println("6、医生管理-展示全部医生的坐诊详情（当前和未来6天的坐诊详情");
            System.out.println("7、医生管理-挂号预约");
            System.out.println("8、搜索某个医生当前和未来6天内的病人预约详情（展示每天预约病人的具体信息");
            System.out.println("请输入操作命令：");
            String command = sc.next();
            switch (command){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("输入的指令有误，请重新输入");

            }
        }
    }
}
