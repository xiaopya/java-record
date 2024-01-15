package com.objects;

import java.util.Objects;

/**
 * Objects类常用方法
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "test";
        // System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2)); // 更安全

        System.out.println(Objects.isNull(s1)); // false
        System.out.println(s1 == null);
        System.out.println(Objects.isNull(s2)); // true
    }
}
