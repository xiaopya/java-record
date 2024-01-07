package com.itheima.memory;

import java.util.Random;
import java.util.Scanner;

/**
 * 随即排名
 */
public class SortArray {
    public static void main(String[] args) {
        // 某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名进行汇报。请先一次录入5名员工的工号，然后展示出一组随机的排名顺序。
        String[] staff = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < staff.length; i++) {
            System.out.println("请输入第"+ ( i + 1 ) +"员工的工号");
            String jobNumber = sc.next();
            staff[i] = jobNumber;
        }

        Random r = new Random();
        // 位置随机
        for (int i = 0; i < staff.length; i++) {
            // 随机获取下标
            int index = r.nextInt(staff.length);
            // 先将被替换的数据作为临时数据存下来，在跟需要交换的数据进行交换。
            String temp = staff[index];
            staff[index] =  staff[i];
            staff[i] = temp;
        }

        for (int i = 0; i < staff.length; i++) {
            System.out.print(staff[i] + " ");
        }
    }
}
