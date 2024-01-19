package com.itheima;

/**
 * 数字加密
 * 加密规则：对密码中的每位数加5，在对10求余，最后将所有的数字顺序反转，得到一串加密厚的新数
 */
public class Test4 {
    public static void main(String[] args) {
        // 加密
        System.out.println(encrypt(1983)); // 8346
        // 解密
        System.out.println(encrypt(8346)); // 1983
    }

    /**
     * 分析：
     * 1. 定义一个方法需要接收一个未加密的一串数字
     * 2. 对数字进行拆分，类似：[1,2,3,4,5]
     * 3. 对每一位数字进行加5，在对10求余
     * 4. 在将数字反转
     * 5. 对反转后的数字进行拼接
     * 6. 输出拼接后的加密结果
     */
    public static String encrypt(int number) {
        // 1. 对数字进行拆分
        int[] num = split(number);
        // 2. 对每一位数字进行加5，在对10求余
        for (int i = 0; i < num.length; i++) {
            num[i] = (num[i] + 5) % 10;
        }
        // 3. 在将数字反转
        reverse(num);

        // 4. 对反转后的数字进行拼接
        String str = "";
        for (int i = 0; i < num.length; i++) {
            str += num[i];
        }

        return str;
    }

    public static void reverse(int[] num) {
        // 对i和j的位置进行互换
        for (int i = 0, j = num.length - 1; i < j; i++, j--) {
            int temp =  num[j];
            num[j] = num[i];
            num[i] = temp;
        }
    }

    public static int[] split(int number) {
        int[] nums = new int[4];
        nums[0] = number / 1000;
        nums[1] = (number / 100) % 10;
        nums[2] = (number / 10) % 10;
        nums[3] = number % 10;
        return nums;
    }
}
