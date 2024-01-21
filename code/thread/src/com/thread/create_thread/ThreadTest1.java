package com.thread.create_thread;

/**
 * @projectName: java学习记录
 * @package: com.thread.create_thread
 * @className: ThreadTest1
 * @author: cyl
 * @description: TODO 创建多线程1  继承了多线程，就没办法在继承其他类了，太局限了
 * @date: 2024/1/21 13:55
 * @version: 1.0
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread u = new User();
        u.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("我是main 主线程");
        }
    }
}
