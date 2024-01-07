package com.itheima;

/**
 * 整型数组拷贝
 */
public class Test5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = arrayCopy(a);
        a[1] = 99;

        // 俩个数组的地址已经改变了
        System.out.println(a[1]); // 99
        System.out.println(b[1]); // 2
    }

    /**
     * 分析：
     * 1. 根据传入的数组长度，定义一个动态初始化的数组
     * 2. 遍历原数组，拿到每一位数据，插入到新数组中
     * 3. 返回新数组
     */
    public static int[] arrayCopy(int[] arr){
        int[] newArrs = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArrs[i] = arr[i];
        }
        return newArrs;
    }
}
