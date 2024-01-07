package com.itheima.define;

/**
 * 数组：静态初始化数组
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 1. 数据类型[] 数据名 = new 数据类型[] {元素1,元素2,元素3};
        int[] ages = new int[]{11,22,33,44,55};
        double[] ages1 = new double[]{11.4,44.5,55.2,99};

        // 2. 其中 new 数据类型[] 是可以简化的，可以不写，因为前面已经申明过了。
        int[] ages2 = {11,22,33,44,55};
        double[] ages3 = {11.1,22.5,33,44.888,55};



        // 3.也可以写成 数据类型 数组名[]
        // 但是不建议
        int ages4[] = {11,22,33,44,55};
        double ages5[] = {11.1,22.5,33,44.888,55};
    }
}
