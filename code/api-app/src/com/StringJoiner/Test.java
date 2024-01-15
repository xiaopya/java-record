package com.StringJoiner;

import java.util.StringJoiner;

/**
 * StringJoiner 比String更快 比StringBuilder更简洁，JDK8才开始有
 * new StringJoiner("间隔符号","开始符号","结尾符号");
 */
public class Test {
    public static void main(String[] args) {
        // [1, 2, 3, 4, 5, 9]
        System.out.println(getArrayData(new int[]{1,2,3,4,5,9}));
    }

    public static String getArrayData(int[] arr) {

        if (arr == null) {
            return null;
        }

        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }

        return sj.toString();
    }

}
