package com.itheima.conditions;

/**
 * switch写法
 * 注意：
 * 1. break如果不写，会出现穿透现象
 * 2. 表达式类型只能是 byte,short,int,char JDK5开始支持枚举，JDK7开始支持String，不支持double，float，long
 */
public class SwitchDemo {
    public static void main(String[] args) {
        // 需求：日程
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("周一");
                break;
            case "周二":
                System.out.println("周二");
                break;
            case "周三":
                System.out.println("周三");
                break;
            case "周四":
                System.out.println("周四");
                break;
            case "周五":
                System.out.println("周五");
                break;
            case "周六":
                System.out.println("周六");
                break;
            case "周日":
                System.out.println("周日");
                break;
            default:
                System.out.println("不存在该日期");
        }


        // switch 穿透
        String week1 = "周六";
        switch (week1){
            case "周一":
            case "周二":
            case "周三":
            case "周四":
            case "周五":
                System.out.println("工作");
                break;
            case "周六":
            case "周日":
                System.out.println("休息");
                break;
            default:
                System.out.println("不存在该日期");
                break;
        }
    }
}
