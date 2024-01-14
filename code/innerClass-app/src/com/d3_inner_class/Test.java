package com.d3_inner_class;

/**
 * 匿名类
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cat() {
                System.out.println("喵喵!~~~");
            }
        };
        a.cat();
    }
}

abstract class Animal{
    public abstract void cat();
}
