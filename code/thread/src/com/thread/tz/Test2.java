package com.thread.tz;

/**
 * @projectName: java学习记录
 * @package: com.thread.tz
 * @className: Test1
 * @author: cyl
 * @description: TODO 乐观锁
 * @date: 2024/1/21 18:10
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 原理：每个线程在拿到count进行计算的时候，拿到count=10，先计算+1结果为11，在写入11这个数据的时候，拿一开始的count=10和现在的count进行比较，如果一样，就将变量中的count改为11。
        // 如果不一样就代表其他的线程种已经修改过了，则当前计算作废，重新拿到count=11的数据，进行+1操作，
        // 底层源码是没有加锁的，是通过CAS算法进行计算

        Runnable r = new MyRunnable1();
        // 创建100个线程
        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }
    }
}
