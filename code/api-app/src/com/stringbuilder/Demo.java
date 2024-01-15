package com.stringbuilder;

/**
 * 设计方法：返回任意整型数组的内容，格式为：[11,2,33,44]
 */
public class Demo {
    public static void main(String[] args) {
        // [1, 2, 3, 4, 5, 6, 111, 222]
        System.out.println(getArrayData(new int[]{1, 2, 3, 4, 5, 6, 111, 222}));
    }

    public static String getArrayData(int[] arr) {

        if (arr == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");

            }
        }
        sb.append("]");
        return sb.toString();
    }
}
