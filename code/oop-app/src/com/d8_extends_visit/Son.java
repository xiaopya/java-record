package com.d8_extends_visit;

/**
 * 当前类可以用this去访问
 * 父类可以用super关键字去访问，
 */
public class Son extends Father {
    String name = "son";

    public void handlerPrint() {
        String name = "handlerPrint";
        System.out.println(name); // handlerPrint
        System.out.println(this.name); // son
        System.out.println(super.name); // father
        super.print();
    }
}
