package com.thread.create_thread;

/**
 * @projectName: java学习记录
 * @package: com.thread.create_thread
 * @className: ThreadTest1
 * @author: cyl
 * @description: TODO 创建多线程2 匿名内部类创建方式
 * @date: 2024/1/21 13:55
 * @version: 1.0
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("我是子线程");
                }
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("我是main 主线程");
        }
    }
}
