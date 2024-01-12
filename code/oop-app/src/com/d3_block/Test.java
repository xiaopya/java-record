package com.d3_block;

public class Test {
    public static void main(String[] args) {
        // 这里不管创建多少个对象，静态代码块都是只执行一次
        // 而实例代码快每次创建一个对象都会执行一次
        Block b = new Block();
        Block b1 = new Block();
        Block b2 = new Block();
        Block b3 = new Block();
        Block b4 = new Block();
    }
}
