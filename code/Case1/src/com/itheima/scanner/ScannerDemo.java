package com.itheima.scanner;

import java.util.Scanner;

/**
 * 接收键盘信息
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // 导包：一般不需要我们自己做，ide工具会自动帮助我们导入。
        Scanner sc = new Scanner(System.in); // 扫描器对象
        System.out.println("请您输入您的年龄: ");
        int age = sc.nextInt(); // 接收用户输入一个整数
        System.out.println("您的年龄是：" + age);
        System.out.println("请您输入您的姓名：");
        String name = sc.next(); // 会等待用户输入一个名称
        System.out.println("欢迎" + name + "进入系统~~");
    }
}
