package com.thread.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @projectName: java学习记录
 * @package: com.thread.Demo
 * @className: Test
 * @author: cyl
 * @description: TODO 线程案例：俩个人同时发100个礼物，分别输出俩个人发出的次数（如果礼物小于10个 就不再送出）
 * @date: 2024/1/21 17:45
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String[] gifts = {"皮带","口红","玩具","乐高","手机"};
        List<String> lists = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            lists.add(gifts[r.nextInt(gifts.length)] + (i+1));
        }

        GiveGift gift1 = new GiveGift(lists,"小红");
        gift1.start();

        GiveGift gift2 = new GiveGift(lists,"小红");
        gift2.start();

        gift1.join();
        gift2.join();

        System.out.println(gift1.getCount());
        System.out.println(gift2.getCount());
    }
}
