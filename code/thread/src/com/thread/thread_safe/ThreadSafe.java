package com.thread.thread_safe;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_safe
 * @className: ThreadSafe
 * @author: cyl
 * @description: TODO 线程安全
 * @date: 2024/1/21 15:23
 * @version: 1.0
 */
public class ThreadSafe {
    public static void main(String[] args) {
        // 俩个人同时在一个账户里面取钱
        Account acc = new Account(100000);
        Thread t1 = new Thread1(acc, "小红");
        Thread t2 = new Thread1(acc, "小绿");
        t1.start();
        t2.start();
    }
}
