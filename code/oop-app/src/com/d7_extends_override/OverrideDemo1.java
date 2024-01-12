package com.d7_extends_override;

/**
 * 重写子类
 */
public class OverrideDemo1 extends OverrideDemo {

    public double num;
    public String name;

    public OverrideDemo1() {

    }

    public OverrideDemo1(double num, String name) {
        this.num = num;
        this.name = name;
    }


    // 现在是继承了Override类，它里面的print方法，不满足需求，可以重新他的方法
    // 重写一个方法，建议加上 @Override 注解，它可以帮忙检查重写方法的正确性
    @Override
    public void print() {
        System.out.println("重写后的输出print1");
    }

    @Override
    public void print(int a, int b) {
        System.out.println("重写后的输出print2");
    }

    // 重写toString 方法
    // 右键菜单 Generate 里面有这个重写，也不需要自己手写，
    @Override
    public String toString() {
        return "OverrideDemo1{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
