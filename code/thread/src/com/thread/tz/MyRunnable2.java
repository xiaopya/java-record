package com.thread.tz;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @projectName: java学习记录
 * @package: com.thread.tz
 * @className: MyRunnable1
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 18:10
 * @version: 1.0
 */
public class MyRunnable2 implements Runnable {
    // 记录浏览人数
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + count.incrementAndGet());
        }
    }
}
