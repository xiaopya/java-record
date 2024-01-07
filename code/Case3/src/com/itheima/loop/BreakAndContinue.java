package com.itheima.loop;

/**
 * break和continue
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // 终止当前循环
                break;
            }
            System.out.println("break..." + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // 跳出当前循环
                continue;
            }
            System.out.println("continue..." + i);
        }
    }
}
