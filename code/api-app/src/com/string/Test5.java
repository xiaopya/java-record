package com.string;

import java.util.Random;
import java.util.Scanner;

/**
 * 产生随机验证码，获取用户并校验
 * 这里用的 equalsIgnoreCase 不区分大小写
 */
public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            // 接收随机验证码
            String code = createRandomCode(9);
            System.out.println("请用户输入正确的验证码：" + code);
            String userCode = sc.next();
            boolean bool = compareCode(code,userCode);
            if(bool){
                System.out.println("验证成功");
                break;
            }else{
                System.out.println("验证失败，请重新输入");
            }
        }
    }

    public static boolean compareCode(String code,String newCode){
        return code.equalsIgnoreCase(newCode);
    }

    /**
     * 生成随机验证码
     * @param n int
     * @return String
     */
    public static String createRandomCode(int n){

        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();

        int length = data.length();
        // 产生随机位数的验证码
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(length);
            code += data.charAt(index);
        }
        return code;
    }
}
