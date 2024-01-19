package com.itheima.memory;

/**
 * 多个变量只想同一个数组对象的形式。
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int[] arr1 = arr;

        arr1[1] = 99;
        // 他们都是指向同一个内存地址
        System.out.println(arr); // [I@776ec8df
        System.out.println(arr1);// [I@776ec8df
        System.out.println(arr[1]); // 99

        // 空指针错误
        arr1 = null;
        System.out.println(arr1); // null
        /**
         * Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr1" is null
         * at com.itheima.memory.ArrayDemo1.main(ArrayDemo1.java:21)
         */
        // NullPointerException
        System.out.println(arr1[1]);


    }
}
