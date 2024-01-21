package com.thread.thread_pool;

import java.util.concurrent.*;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_pool
 * @className: ThreadPool
 * @author: cyl
 * @description: TODO 线程池 Executors工具类（大量并发任务不能用这个，淘宝那种，需要用ThreadPoolExecutor去创建线程池，自己定义运行规则）
 * @date: 2024/1/21 16:14
 * @version: 1.0
 */
public class ThreadPool1 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
    }
}
