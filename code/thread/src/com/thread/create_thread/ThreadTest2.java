package com.thread.create_thread;

/**
 * @projectName: java学习记录
 * @package: com.thread.create_thread
 * @className: ThreadTest1
 * @author: cyl
 * @description: TODO 创建多线程2 实现了接口，还是可以继承其他的类，扩展性强
 * @date: 2024/1/21 13:55
 * @version: 1.0
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Runnable u = new User1();
        new Thread(u).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("我是main 主线程");
        }
    }
}
