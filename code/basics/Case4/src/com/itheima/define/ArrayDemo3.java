package com.itheima.define;

/**
 * 数组：动态初始化数组
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr[0] + "---" + arr[9]); // 默认值：[0,0,0,0,0,0,0,0,0,0]
        arr[0] = 40;
        arr[1] = 34;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        char[] charArray = new char[4];
        System.out.println((int)charArray[0] + "---" + (int)charArray[3]); //默认值也是 0 ，只不过打印出来会转成char类型的，就会输出乱码，可以转成int格式

        double[] doubleArray = new double[4];
        System.out.println(doubleArray[0] + "---" + doubleArray[3]); // 默认值：0.0

        String[] stringArray = new String[4];
        System.out.println(stringArray[0] + "---" + stringArray[3]); // 默认值：null

        boolean[] booleanArray = new boolean[4];
        System.out.println(booleanArray[0] + "---" + booleanArray[3]); // 默认值：false
    }
}
