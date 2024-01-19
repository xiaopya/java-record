package com.itheima;

/**
 * 找出素数
 */
public class Test7 {
    public static void main(String[] args) {
        getPrimeNumber2(101,200);
    }

    /**
     * 标签法  out可以是任意
     * @param start
     * @param end
     */
    public static void getPrimeNumber2(int start,int end){
        out:
        for (int i = start; i < end; i++) {
            for (int j = 2; j < start / 2; j++) {
                if(i % j == 0){
                    continue out;
                }
            }
            System.out.println(i);
        }
    }


    /**
     * 第一种方法，用开关flag
     * @param start
     * @param end
     */
    public static void getPrimeNumber1(int start,int end){
        for (int i = start; i < end; i++) {
            // 默认 认为当前i就是素数
            boolean flag = true;

            for (int j = 2; j < start / 2; j++) {
                if(i % j == 0){
                    flag = false;
                }
            }

            if(flag){
                System.out.println(i);
            }
        }
    }
}
