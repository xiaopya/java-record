package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 秒杀案例
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        //1目标：完成秒杀案例。
        // 1、把开始时间、结束时间、小贾下单时间、小皮下单时间拿到程序中来。
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";

        // 先转成时间对象
        SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = simple.parse(start).getTime();
        long endTime = simple.parse(end).getTime();
        long xjTime = simple.parse(xj).getTime();
        long xpTime = simple.parse(xp).getTime();

        if(xjTime > startTime && xjTime < endTime){
            System.out.println("小贾，秒杀成功了");
        }else{
            System.out.println("小贾失败了");
        }

        if(xpTime > startTime && xpTime < endTime){
            System.out.println("小屁，秒杀成功了");
        }else{
            System.out.println("小屁失败了");
        }
    }
}
