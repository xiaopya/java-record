package com.itheima.loop;

/**
 * while
 * 知道循环次数用for，不知道循环次数用while
 */
public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("hello world");
            i++;
        }

        //例子
        // 需求：珠穆朗玛峰高度：8848.86米=8848860毫米，一张纸厚度0.1毫米，需要折多少次才能达到珠穆朗玛峰的高度。
        double peakHeight = 8848860;
        double paperHeight = 0.1;
        int count = 0;
        while (paperHeight < peakHeight){
            paperHeight *= 2;
            count++;
        }
        System.out.println(count);

        // 也可以用for去写
//        for(;paperHeight < peakHeight;count++){
//            paperHeight *= 2;
//
//        }
//        System.out.println(count);
    }
}
