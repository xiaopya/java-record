package com.thread.thread_api;

/**
 * @projectName: java学习记录
 * @package: com.thread.thread_api
 * @className: MyThread
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 14:49
 * @version: 1.0
 */
public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行了...");
            if(i == 3){
                try {
                    System.out.println("暂停3s");
                    Thread.sleep(3000);

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
