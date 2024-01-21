package com.thread.create_thread;

/**
 * @projectName: java学习记录
 * @package: com.thread.create_thread
 * @className: User
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 14:02
 * @version: 1.0
 */
public class User extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我是user类 继承的单独线程");
        }
    }
}
