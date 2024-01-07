package com.itheima;

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球
 * 规则：
 * 1. 选7个号码，6位红球，1位篮球，前6个号码是从1-33之间选择（不重复），最后一位号码从1-16之间选择（不重复）
 * 2. 系统随机生成不7个号码，
 * 3. 和用户的号码比较，是否中奖
 */
public class Test10 {
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumbers();
        int[] luckNumbers = createLuckNumbers();
        print("用户号码: ",userNumbers);
        print("中奖号码: ",luckNumbers);
        compare(userNumbers,luckNumbers);
    }

    /**
     * 让用户随机选择一串7位的随机号码
     * @return int[]
     */
    public static int[] userSelectNumbers(){
        int[] numbers = new int[7];

        // 定义扫描器,让用户手动输入7位号码
        Scanner sc = new Scanner(System.in);
        // 选择6为红球号码
        for (int i = 0; i < numbers.length - 1; i++) {

            while (true) {
                System.out.println("请在(1-33)之间选择第"+ (i+1) +"位号码！");
                int temp = sc.nextInt();
                // 拿到用户输入的第一位号码，需要判断是否在1-33之间，之前是否已经选择过了，
                if(temp < 1 || temp > 33){
                    System.out.println("该号码不在1-33之间，请重新选择！");
                }else{
                    // 判断之前是否选择过相同的号码
                    boolean bool = exist(numbers,temp);
                    if(bool){
                        System.out.println("已经选择过相同的号码，请重新选择！");
                    }else{
                        numbers[i] = temp;
                        // 终止循环
                        break;
                    }
                }
            }
        }

        // 选择最后一位篮球号码
        while (true) {
            System.out.println("请在(1-16)之间选择最后一位篮球号码！");
            int temp = sc.nextInt();
            // 判断是否在1-16之间
            if(temp < 1 || temp > 16){
                System.out.println("该号码不在1-16之间，请重新选择！");
            }else{
                numbers[6] = temp;
                break;
            }
        }

        return numbers;
    }

    /**
     * 系统生成7位随机中奖号码
     * @return int[]
     */
    public static int[] createLuckNumbers(){
        int[] numbers = new int[7];
        Random r = new Random();
        // 随机生成6位不重复的红球
        for (int i = 0; i < numbers.length; i++) {
            // 随机生成1-33之间的数字
            while (true) {
                int temp = r.nextInt(33) + 1;
                boolean bool = exist(numbers,temp);
                if(!bool){
                    numbers[i] = temp;
                    break;
                }
            }
        }
        // 随机生成1位篮球
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    public static void compare(int[] userNumbers,int[] luckNumbers){
        // 定义俩个球分别记录中奖号码的次数
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if(userNumbers[i] == luckNumbers[j]){
                    redCount++;
                    // 找到一个就没必要再继续循环了
                    break;
                }
            }
        }
        blueCount = userNumbers[6] == luckNumbers[6] ? 1 : 0;

        String type = redCount + "+" + blueCount;

        System.out.println("中"+ type);

        switch (type){
            case "6+1":
                System.out.println("恭喜你中奖了1000w");
                break;
            case "6+0":
                System.out.println("恭喜你中奖了500w");
                break;
            case "5+1":
                System.out.println("恭喜你中奖了3000");
                break;
            case "5+0":
            case "4+1":
                System.out.println("恭喜你中奖了200");
                break;
            case "4+0":
            case "3+1":
                System.out.println("恭喜你中奖了10");
                break;
            case "2+1":
            case "1+1":
            case "0+1":
                System.out.println("恭喜你中奖了5");
                break;
            default:
                System.out.println("未中奖!");
                break;
        }
    }

    /**
     * 判断numbers里面是否存在temp
     * @param numbers int[]
     * @param temp int
     * @return boolean
     */
    private static boolean exist(int[] numbers, int temp) {
        // [11,13,14,0,0,0,0]
        for (int i = 0; i < numbers.length; i++) {
            // 如果是0，后面的就不需要在判断了
            if(numbers[i]  == 0 ){
                break;
            }
            if(numbers[i] == temp){
                return true;
            }
        }
        return false;
    }

    /**
     * [1,2,3,4,5,6,7] 格式 打印
     * @param arr int[]
     */
    public static void print(String info,int[] arr){
        System.out.print(info + "[");
        int temp = arr.length;
        for (int i = 0; i < temp; i++) {
            System.out.print( i == temp - 1 ? arr[i] : arr[i]+", ");
        }
        System.out.println("]");
    }

}
