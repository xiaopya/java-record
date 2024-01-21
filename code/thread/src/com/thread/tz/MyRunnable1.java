package com.thread.tz;

/**
 * @projectName: java学习记录
 * @package: com.thread.tz
 * @className: MyRunnable1
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 18:10
 * @version: 1.0
 */
public class MyRunnable1 implements  Runnable{
    // 记录浏览人数
    private int count;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 悲观锁
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ": " +  ++count);
            }
        }
    }
}
