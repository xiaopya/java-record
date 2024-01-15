package com.d8_extends_jdk8;

/**
 * JDK8开始接口新增了三种形式的方法
 * 他们的前面除了private 其他的都会默认加上 public修饰，因为外部调用该接口的时候都是可以直接被使用的
 * 作用就是：增加了接口的能力，便于项目的维护，在别的类继承该接口的时候，就可以在接口中直接将方法实现好，其他类直接调用即可
 */
public interface Test {
    /**
     * 默认方法（实例方法）：使用default修饰
     */
    default void test1(){

        test2();
    }

    /**
     * 私有方法，外面不能直接访问的，只能接口内使用
     */
    private void test2(){

    }

    /**
     * 静态方法
     */
    static void test3(){

    }
}
