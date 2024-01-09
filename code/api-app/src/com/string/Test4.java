package com.string;

import java.util.Scanner;

/**
 * 登录
 * 俩个字符串比较不能用 == 因为 == 比较的是俩个字符串的地址。
 * 需要用到字符串方法 equals
 */
public class Test4 {
    public static void main(String[] args) {

        // 获取用户输入的账密
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入账号: ");
            String account = sc.next();
            System.out.println("请输入密码: ");
            String pwt = sc.next();
            // 校验账密是否正确
            boolean bool = login(account,pwt);
            if(bool){
                System.out.println("进入系统...");
                break;
            }else{
                System.out.println("账号或密码错误");
            }
        }
    }

    public static boolean login(String account,String pwt){
        // 正确的账密
        String a = "chen";
        String p = "962464";
        return a.equals(account) && p.equals(pwt);
    }
}
