package com.thread.thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_safe
 * @className: Account
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 15:23
 * @version: 1.0
 */
public class Account {
    private double money;
    private final Lock lock = new ReentrantLock();

    // 第一种方法
    // public void drawMoney(double money) {
    //     // 获取当前线程的名称
    //     String name = Thread.currentThread().getName();
    //     // 创建一个同步锁，实例方法用this作为锁，static方法用类名.class作为锁
    //     synchronized (this) {
    //         // 判断当前取的钱是否够
    //         if(this.money >= money){
    //             System.out.println(name + "成功取走了：" + money);
    //             this.money -= money;
    //             System.out.println("剩余的钱为：" + this.money);
    //         }else{
    //             System.out.println("没钱了");
    //         }
    //     }
    // }
    // 第二种方法
    // 增加修饰符，变成同步方法（相比第一种方法性能好，锁的范围小）
    // public synchronized void drawMoney(double money) {
    //     // 获取当前线程的名称
    //     String name = Thread.currentThread().getName();
    //     // 创建一个同步锁，实例方法用this作为锁，static方法用类名.class作为锁
    //         // 判断当前取的钱是否够
    //         if(this.money >= money){
    //             System.out.println(name + "成功取走了：" + money);
    //             this.money -= money;
    //             System.out.println("剩余的钱为：" + this.money);
    //         }else{
    //             System.out.println("没钱了");
    //         }
    // }
    // 第三种方法，lock锁
    public void drawMoney(double money) {
        // 获取当前线程的名称
        String name = Thread.currentThread().getName();
        try {
            // 加锁
            lock.lock();
            // 创建一个同步锁，实例方法用this作为锁，static方法用类名.class作为锁
            // 判断当前取的钱是否够
            if (this.money >= money) {
                System.out.println(name + "成功取走了：" + money);
                this.money -= money;
                System.out.println("剩余的钱为：" + this.money);
            } else {
                System.out.println("没钱了");
            }

        } finally {
            // 防止中间代码逻辑出现问题，无法解锁，后续的线程无法正常进入
            // 解锁
            lock.unlock();
        }
    }

    public Account() {

    }

    public Account(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
