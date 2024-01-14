package com.d9_generics_method;
import java.util.ArrayList;

/**
 * 泛型方法
 * ? 是通配符接收所有类型，写成 ? extends Car 的时候，传入的类型就只能是Car或者是继承这个类型的类
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BENZ());
        cars.add(new BMW());
        go(cars);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

    }

    public static  void go(ArrayList<? extends Car> cars){

    }


    // public static <T> T go(T t){
    //     return t;
    // }
}
