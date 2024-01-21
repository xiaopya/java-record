package com.thread.thread_safe;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_safe
 * @className: Thread1
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 15:24
 * @version: 1.0
 */
public class Thread1 extends Thread {

    private Account acc;

    public Thread1(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
