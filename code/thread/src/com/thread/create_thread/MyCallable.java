package com.thread.create_thread;

import java.util.concurrent.Callable;

/**
 * @projectName: java学习记录
 * @package: com.thread.create_thread
 * @className: MyThread
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 14:27
 * @version: 1.0
 */
public class MyCallable implements Callable<String> {
    private final int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        int nums = 0;
        for (int i = 1; i <= this.number; i++) {
            nums += i;
        }
        return "返回的结果是：" + nums;
    }
}
