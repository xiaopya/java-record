package com.thread.Demo;

import java.util.List;
import java.util.Random;

/**
 * @projectName: java学习记录
 * @package: com.thread.Demo
 * @className: GiveGift
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/21 17:50
 * @version: 1.0
 */
public class GiveGift extends Thread{

    private List<String> lsits;
    private int count = 0;

    public GiveGift(List<String> lsits,String name) {
        super(name);
        this.lsits = lsits;
    }

    @Override
    public void run() {
        Random r = new Random();
        // 小红和小蓝 同时分发礼物
        // 加锁,这里不能用this，他们俩个人new了俩个对象，这里的this不是唯一的，会出现问题
        // 这里的礼物是唯一的，可以用list当做唯一锁
        while (true) {
            synchronized (lsits){
                // 判断当前礼物是否小于10
                if(lsits.size() < 10){
                    break;
                }
                lsits.remove(r.nextInt(lsits.size()));
                // 这里不需要判断是谁，因为每次进来的都是唯一的
                count++;
            }
        }
    }

    // 返回他们各自发送礼物的数量
    public int getCount() {
        return count;
    }
}
