package com.thread.create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @projectName: java学习记录
 * @package: com.thread.create_thread
 * @className: ThreadTest1
 * @author: cyl
 * @description: TODO 创建多线程3
 * @date: 2024/1/21 13:55
 * @version: 1.0
 */
public class ThreadTest4 {
    public static void main(String[] args) throws Exception {
        // 定义的Callable接口，需要重写call方法
        Callable<String> callable = new MyCallable(100);
        // 需要吧对象类型封装成FutureTask（线程对象）
        FutureTask<String> task = new FutureTask<>(callable);
        // 在通过 Thread 线程去执行
        new Thread(task).start();

        Callable<String> callable1 = new MyCallable(100);
        FutureTask<String> task1 = new FutureTask<>(callable1);
        new Thread(task1).start();

        // 如果上面的线程没有跑完，这里的会直接暂停，他会在执行完上面的线程并拿到结果后，再去执行下面去拿到对应的结果
        System.out.println(task.get());
        System.out.println(task1.get());
    }
}
