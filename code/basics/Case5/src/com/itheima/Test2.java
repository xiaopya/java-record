package com.itheima;

import java.util.Random;

/**
 * 随机验证码
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(authCode(6));
    }

    /**
     * 分析：
     * 1. 先定义随机类型，随机出 数字，大写字母，小写字母
     * 2. 根据上面三种类型，用switch方法，进行对于的随机数生成，
     * 3. 最后用String类型的变量进行接收
     * 4. 最后输出该随机数结果
     */
    public static String authCode(int n){
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            // 定义随机类型0：数字 1：大写字母 2：小写字母
            int type = r.nextInt(3);
            switch(type){
                case 0:
                    // 随机 0-9 之间的数字
                    code += r.nextInt(10);
                    break;
                case 1:
                    // 随机26位大写字母,需要转成对于的字符串
                    code += (char)(r.nextInt(26) + 65);
                    break;
                case 2:
                    code += (char)(r.nextInt(26) + 97);
                    break;
            }
        }
        return code;
    }
}
