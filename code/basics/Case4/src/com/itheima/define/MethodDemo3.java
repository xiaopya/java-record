package com.itheima.define;

/**
 * 方法:引用类型
 * 这个时候 handlerTemp拿到的是temp的地址
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        int[] temp = {1,2,3,4};
        handlerTemp(temp);
        System.out.println(temp[1]); // 99
    }

    public static void handlerTemp(int[] arr){
        System.out.println(arr[1]); // 2
        arr[1] = 99;
        System.out.println(arr[1]); // 99
    }
}
