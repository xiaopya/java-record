package com.thread.thread_pool;

import java.util.concurrent.*;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_pool
 * @className: ThreadPool
 * @author: cyl
 * @description: TODO 线程池: 核心线程数量 -> （计算密集型任务：核心线程数量 = CPU的核数 + 1） （IO密集型任务：核心线程数量 = CPU的核数 * 2）
 * @date: 2024/1/21 16:14
 * @version: 1.0
 */
public class ThreadPool {
    public static void main(String[] args) {
        /*
         ThreadPoolExecutor(
         int corePoolSize, 指定线程池的核心线程数量
         int maximumPoolSize, 指定线程池的最大线程数量
         long keepAliveTime, 指定临时线程的存活时间 ( maximumPoolSize - corePoolSize 就是临时员工)
         TimeUnit unit, 指定临时线程存活的时间单位
         BlockingQueue<Runnable> workQueue, 指定线程池的任务队列
         ThreadFactory threadFactory, 指定线程池的线程工厂
         RejectedExecutionHandler handler 指定线程池的任务拒绝策略（线程都在忙，任务队列也满了的时候，新任务来了该怎么处理）
         )
         */
        ExecutorService pool = new ThreadPoolExecutor(3,5,8,TimeUnit.SECONDS,new ArrayBlockingQueue<>(4)
                ,Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        // 线程池会自动创建新的线程去执行这个（在一开始指定的核心线程就是3个）
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        // 线程池会创建新的线程放到任务队列种，依次执行（new ArrayBlockingQueue<>(4)，设置了队列线程数量为4个）
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        // 线程池会创建俩个临时线程去执行任务 （maximumPoolSize - corePoolSize 就是临时线程）
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

        // 如果还有线程，会被 new ThreadPoolExecutor.AbortPolicy() 这个方法执行后抛出异常，因为线程池满了
        // 1.AbortPolicy这个方法一旦线程池满了会抛出异常
        // 2.CallerRunsPolicy改成这个方法，线程池要是满了，接下来创建的会被主线程执行，也就是main方法会去执行这个线程
        // ...
        pool.execute(new MyRunnable());

    }
}
