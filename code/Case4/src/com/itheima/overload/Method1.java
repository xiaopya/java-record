package com.itheima.overload;

/**
 * 方法重载
 */
public class Method1 {
    public static void main(String[] args) {
        test();
        test(1);
        test(1.0);
        int temp = test(1,2);
        System.out.println(temp);
    }

    public static void test(){
        System.out.println("test---1");
    }
    public static void test(int a){
        System.out.println("test---2" + a);
    }

    public  static void test(double a){
        System.out.println("test double" + a);
    }

    public static int test(int a,int b){
        return a + b;
    }
}
