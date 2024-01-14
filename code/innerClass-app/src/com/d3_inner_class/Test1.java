package com.d3_inner_class;

/**
 * 匿名类的使用场景，通常是当做参数传递给方法使用
 */
public class Test1 {
    public static void main(String[] args) {
        go(new Animals(){
            @Override
            public void cat(){
                System.out.println("猫叫了");
            }
        });
    }

    public static void go(Animals s){
        System.out.println("开始——————————");
        s.cat();
    }
}

interface Animals{
    void cat();
}
