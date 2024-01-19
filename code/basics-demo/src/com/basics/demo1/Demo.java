package com.basics.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @projectName: code
 * @package: com.basics.demo1
 * @className: Demo
 * @author: chenYongLong
 * @description: TODO 作业1 枪毙奇数囚犯，找出最后一个幸运儿
 * @date: 2024/1/19 19:40
 * @version: 1.0
 */
public class Demo {

    public static List<People> list = new ArrayList<>();

    public static void main(String[] args) {
        Random r = new Random();
        // 在1-200 之间给100个囚犯随机出不同的编号
        for (int i = 1; i <= 100; i++) {
            while (true) {
                int code = r.nextInt(200) + 1;
                // 判断该编号是否重复
                if(getNoRepeatCode(code)){
                    People p = new People();
                    p.setCode(code);
                    p.setIndex(i);
                    list.add(p);
                    break;
                }
            }
        }
        System.out.println("所有囚犯：" + list);

        // 找到奇数位的囚犯并枪毙，直到剩下一个幸运儿
        while (list.size() > 1){
            List<People> tempPeople = new ArrayList<>();
            // 枪毙奇数，其实就是将偶数位置的囚犯拿出来，进行下一轮枪毙
            // 弄一个临时的存储偶数位置，一直到剩下一个
            for (int i = 1; i < list.size(); i+=2) {
                People p = list.get(i);
                tempPeople.add(p);
            }
            // 这样 tempPeople 每次都会存储到偶数位置的囚犯，再讲他给到list 进行下一轮枪毙
            list = tempPeople;
        }

        System.out.println("幸运儿：" + list);
    }

    public static boolean getNoRepeatCode(int code){
        for (People p : list) {
            if(p.getCode() == code){
                return false;
            }
        }
        return true;
    }


}
