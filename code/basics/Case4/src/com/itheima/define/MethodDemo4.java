package com.itheima.define;

/**
 * 输出内容 [1,2,3,4] 格式
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 4, 5};
        conversionArrayOutput(arrs);
    }

    public static void conversionArrayOutput(int[] arr) {
        if (arr == null) {
            System.out.println("参数错误：" + arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            System.out.print(i == arr.length - 1 ? temp : temp + ", ");
        }
        System.out.println("]");
    }
}
