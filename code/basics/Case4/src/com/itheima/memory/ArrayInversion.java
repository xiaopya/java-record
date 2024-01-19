package com.itheima.memory;

/**
 * 数组反转
 */
public class ArrayInversion {
    public static void main(String[] args) {
        int[] arry = {12, 21, 33, 42, 50};
        for (int i = 0, j = arry.length -1; i < j; i++, j--) {
            // 临时变量
            int temp = arry[j];
            arry[j] = arry[i];
            arry[i] = temp;
        }

        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
