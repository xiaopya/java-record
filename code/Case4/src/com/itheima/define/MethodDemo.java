package com.itheima.define;

/**
 * 定义方法
 */
public class MethodDemo {
    public static void main(String[] args) {
        // 计算求和
        int a = 19;
        int b = 20;
        int count = sum(a, b);
        System.out.println(count);

        put(5);
        System.out.println("---------");
        put(2);
    }

    //修饰符 返回值类型 方法名(参数类型 参数1,参数类型 参数2)
    public static int sum(int a, int b) {
        return a + b; // 返回值
    }

    // 没有返回值 返回类型就需要设置成 void
    public static void put(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("hello world");
        }
    }
}
