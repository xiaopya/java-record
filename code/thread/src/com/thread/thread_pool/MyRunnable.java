package com.thread.thread_pool;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_pool
 * @className: MyRunnable
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 16:32
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---> 线程执行了");
    }
}
