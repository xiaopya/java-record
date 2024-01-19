package com.itheima.define;

/**
 * 数组的访问和修改
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);
    }
}
