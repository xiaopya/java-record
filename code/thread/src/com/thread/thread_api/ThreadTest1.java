package com.thread.thread_api;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_api
 * @className: ThreadTest1
 * @author: cyl
 * @description: TODO Thread 常用方法
 * @date: 2024/1/21 14:46
 * @version: 1.0
 */
public class ThreadTest1 {
    public static void main(String[] args) throws Exception {
        Thread t = new MyThread("1号线程");
        t.start();
        // join 是让某线程先执行完
        t.join();
        System.out.println(t.getName());

        Thread t1 = new MyThread("2号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("3号线程");
        t2.start();
        System.out.println(t2.getName());


        // 那个线程调用了这个方法，他就执行那个线程（现在是主线程调用的）
        Thread main1 = Thread.currentThread();
        main1.setName("主线程的名称");
        System.out.println(main1.getName());
    }
}
