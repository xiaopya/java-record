package com.d3_block;

/**
 * 代码快
 */
public class Block {
    /* 静态代码快 */
    static {
        System.out.println("静态代码块运行了");
    }

    /* 实例代码快 */
    {
        System.out.println("实例代码块运行了");
    }
}
