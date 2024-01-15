package com.integer;

import java.util.ArrayList;

/**
 * 包装类的使用
 * 基本数据类型转换成对象（引用数据类型）
 * 字符串数字 转换成对应的数据类型 valueOf
 */
public class Test {
    public static void main(String[] args) {
        // 基本数据类型转换成对象（引用数据类型）
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        // 自动装箱：可以自动吧基本数据类型的数据转换成对象，不需要同上面一样写Integer.valueOf(12); 这个了
        Integer a2 = 12;

        // 自动拆箱：可以自动吧包装类型的对象转换成对应的基本数据类型
        int a3 = a2;

        // 泛型和集合是不支持基本数据类型的，只能支持引用数据类型
        // 利用包装类，这样ArrayList就可以添加12 13 这些数了
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11); // 自动装箱
        list.add(14); // 自动装箱
        int r = list.get(0); // 自动拆箱
        System.out.println(r);
        System.out.println(list.get(1));


        // 把字符串类型转换成对应的基本数据类型
        String age = "20";
        // int age1 = Integer.parseInt(age);  // 这样的方法不建议用
        int age1 = Integer.valueOf(age); // 建议用这个，他会自动帮我们转换成对应的类型
        System.out.println(age1 + 1); // 21

        String score = "88.6";
        // double score1 = Double.parseDouble(score);   // 这样的方法不建议用
        double score1 = Double.valueOf(score);  // 建议用这个，他会自动帮我们转换成对应的类型
        System.out.println(score1 + 1); // 89.6
    }
}
