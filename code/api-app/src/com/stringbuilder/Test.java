package com.stringbuilder;

/**
 * 建议用StringBuilder 不建议用String
 * StringBuilder 用法
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("xiaopy");

        // 拼接内容
        s.append(12);
        s.append("你好");

        // 支持链式编程
        s.append(45).append(999).append("测试");

        // 反转操作
        s.reverse();

        // 字符串长度
        System.out.println(s.length());

        // 把StringBuilder转成String类型
        String ss = s.toString();

        System.out.println(s);
        System.out.println(ss);
        

        // 如果这里用String 去实现拼接的话，效率很慢，因为String每次拼接都是创建一个新的地址
        StringBuilder sss = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sss.append("acb");
        }
        System.out.println(sss);

    }
}
