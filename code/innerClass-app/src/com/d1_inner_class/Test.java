package com.d1_inner_class;

/**
 * 内部类
 */
public class Test {
    public static void main(String[] args) {
        WithOUt.Inner w = new WithOUt().new Inner();
        w.print();
    }
}
