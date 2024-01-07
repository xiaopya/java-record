package com.itheima.define;

/**
 * 定义方法
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        int s1 = sum(1,100);
        System.out.println(s1);

        isOddEvent(11);
    }

    /**
     * 求和 1-n 的和
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        int temp = 0;
        for (int i = a; i <= b; i++) {
            temp += i;
        }
        return temp;
    }

    public static void isOddEvent(int a){
        if(a % 2 == 1){
            System.out.println("奇数");
        }else{
            System.out.println("偶数");
        }
    }
}
