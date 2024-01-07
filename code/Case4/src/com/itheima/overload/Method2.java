package com.itheima.overload;

/**
 * 方法重载应用场景
 */
public class Method2 {
    public static void main(String[] args) {
        fire("dao国");
        fire("米国",1);
    }

    public static void fire(String country){
        fire(country,1);
    }

    public static void fire(String country,int num){
        System.out.println("向" + country + "发射了" + num + "枚导弹");
    }


}
