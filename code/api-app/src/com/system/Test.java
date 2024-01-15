package com.system;

/**
 * 系统工具
 */
public class Test {
    public static void main(String[] args) {
        // 终止当前运行的Java虚拟机
        // System.exit(0); // 人为终止虚拟机 （不能使用）

        // 返回当前系统时间
        // 主要是做为程序的性能分析
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 100000; i++) {
            System.out.println("输出了：" + i);
        }

        long time1 = System.currentTimeMillis();
        System.out.println(((time1 - time) / 1000.0) + "s");
    }
}
