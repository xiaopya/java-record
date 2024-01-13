package com.d6_interface;

/**
 * 接口的好处：解决了一个类只能单继承的问题
 */
public class Test {
    public static void main(String[] args) {
        Student ss = new Student();
        ss.car();
        ss.game();
    }
}

class Student extends People implements Car, Game {
    @Override
    public void car() {

    }

    @Override
    public void game() {

    }
}

class People {

}

interface Car {
    void car();

}

interface Game {
    void game();
}
