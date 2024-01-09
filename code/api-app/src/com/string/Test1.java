package com.string;

/**
 * String
 * 常用的几种方法
 * 1. public String()                  创建一个空白字符串对象，不含有任何内容
 * 2. public String(String original)   根据传入的字符串内容，来创建字符串对象
 * 3. public String(char[] chars)      根据字符数组的内容，来创建字符串对象
 * 4. public String(byte[] bytes)      根据字节数组的内容，来创建字符串对象
 */
public class Test1 {
    public static void main(String[] args) {

        String str1 = "abc";
        System.out.println(str1);

        char[] ch = {'a','b','c'};
        String str2 = new String(ch);
        System.out.println(str2);

        String str3 = new String("abc小");
        System.out.println(str3);

        byte[] bytes = {97,98,99};
        String str4 = new String(bytes);
        System.out.println(str4);
    }
}
