package com.thread.tz;

/**
 * @projectName: java学习记录
 * @package: com.thread.tz
 * @className: Test1
 * @author: cyl
 * @description: TODO 悲观锁
 * @date: 2024/1/21 18:10
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Runnable r = new MyRunnable1();
        // 创建100个线程
        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }
    }
}
