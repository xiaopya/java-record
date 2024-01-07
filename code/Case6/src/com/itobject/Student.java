package com.itobject;

public class Student {
    String name;
    double chinese;
    double maths;
    double score;

    public void printTotalScore(){
        System.out.println("总成绩为：" + (chinese + maths));
    }

    public void printAverageScore(){
        System.out.println("平均成绩为："+ (chinese + maths) / 2.0);
    }

    public void printThis(){
        System.out.println(this); // 指向当前类的地址
    }

    public void printThisScore(double score){
        if(this.score > score){
            System.out.println("恭喜你成功入选");
        }else{
            System.out.println("很遗憾，落选了");
        }
    }
}
