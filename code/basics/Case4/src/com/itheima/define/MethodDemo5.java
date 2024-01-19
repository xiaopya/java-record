package com.itheima.define;

/**
 * 判断俩个数组是否完全一样
 */
public class MethodDemo5 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(equals(a,b));
    }

    public static boolean equals(int[] a,int[] b){
        // 判断都为null 的情况
        if(a == null && b == null){
            return true;
        }

        // 判断一方为null 的情况
        if(a == null || b == null){
            return false;
        }

        // 判断俩个长度不相等的情况
        if(a.length != b.length){
            return false;
        }

        // 判断俩个数组的值是否相等
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
