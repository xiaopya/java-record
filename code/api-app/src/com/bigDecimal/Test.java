package com.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal用法，解决小数失真的问题
 */
public class Test {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a+ b;
        System.out.println(c); // 0.30000000000000004

        // 把他们变成字符串封装成BigDecimal对象来运算
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1); // 加法
        BigDecimal c2 = a1.subtract(b1); // 减法
        BigDecimal c3 = a1.multiply(b1); // 乘法
        // BigDecimal c4 = a1.divide(b1); // 除法会算到很精确，如果遇到除不尽的，会报错
        BigDecimal c4 = a1.divide(b1,2, RoundingMode.HALF_DOWN); // 2：精确位数，  RoundingMode.HALF_DOWN 舍入模式
        System.out.println(c1); // 0.3
        System.out.println(c2); // -0.1
        System.out.println(c3); // 0.02
        System.out.println(c4); // 0.50

    }
}
