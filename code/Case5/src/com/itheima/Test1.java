package com.itheima;

/**
 * 飞机票
 *  5-10月份为旺季，优惠价格：头等舱9折，经济舱85折
 *  11-4月份为淡季，优惠价格：头等舱7折，经济舱65折
 */
public class Test1 {
    public static void main(String[] args) {
        double num = fares(1000,1,"经济舱");
        System.out.println(num);
    }

    // 季节，舱位，票价
    public static double fares(double price,int month, String type) {
        // 判断当前是淡季还是旺季
        if (month >= 5 && month <= 10) {
            // 旺季
            switch(type){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else{
            // 淡季
            switch(type){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
