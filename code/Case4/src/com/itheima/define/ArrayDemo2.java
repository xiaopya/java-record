package com.itheima.define;

/**
 * 数组的遍历
 *  快捷键：arr.fori
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //案例：某部门5名员工的销售额分别是：16,26,36,6,100,请计算出他们部门的销售额.
        int[] money = {16,26,36,6,100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum+=money[i];
        }
        System.out.println(sum);
    }
}
