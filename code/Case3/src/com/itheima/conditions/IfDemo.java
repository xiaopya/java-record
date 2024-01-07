package com.itheima.conditions;

/**
 * if分支
 */
public class IfDemo {
    public static void main(String[] args) {
        // 需求：测量用户体温，体温要是高于37度就会报警。
        double t = 36.8;
        if(t > 37){
            System.out.println("该用户体温异常。");
        }

        //需求：发红包，你的钱包余额是99元，现在要发出90yuan。
        // 如果钱够，就触发发红包的动作，如果钱不够，则提示钱包余额不足。
        double money = 99;
        double money1 = 90;
        if(money1 > money){
            System.out.println("余额不足");
        }else{
            System.out.println("发送成功");
        }

        //需求：某公司有一个绩效系统，根据员工的打分输出对于的绩效级别 [0,60) D [60,80) C [80,90) B [90,100] A
        int count = 70;
        if(count >=0 && count < 60){
            System.out.println("级别：D");
        }else if(count >=60 && count < 80){
            System.out.println("级别：C");
        }else if(count >=80 && count < 90){
            System.out.println("级别：C");
        }else if(count >=90 && count <= 100){
            System.out.println("级别：A");
        }else{
            System.out.println("存在问题");
        }

    }
}
