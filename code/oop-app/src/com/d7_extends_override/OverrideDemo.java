package com.d7_extends_override;

/**
 * 方法重写
 * 继承后发现父类的方法不满足需求的时候，就需要进行对方发的重写，达到自己想要的效果
 * <p>
 * 所有的类都是默认继承Object
 */
public class OverrideDemo {

    public void print() {
        System.out.println("11111");
    }

    public void print(int a, int b) {
        System.out.println(a + "-----" + b);
    }
}
