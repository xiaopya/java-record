package com.lambda;

/**
 * Lambda表达式
 * 只有函数式接口才可以，并且里面只有一个抽象方法才可以
 * ----------------
 * 静态方法引用 ::
 */
public class Test {
    public static void main(String[] args) {
        // 没有简化的写法
        LambdaTest lam1 = new LambdaTest() {
            @Override
            public void lamTest() {
                System.out.println("我是没简化的");
            }
        };
        lam1.lamTest();

        // 简化的写法
        LambdaTest lam2 = () -> {
            System.out.println("我是简化的");
        };
        lam2.lamTest();

        // 再简化
        LambdaTest lam3 = () -> System.out.println("我是简化的");
        lam3.lamTest();

        // 使用静态方法简化
        FuncTest func = new FuncTest();
    }
}

class FuncTest{
    public static int compareByAge(int o1, int o2){
        return o1 - o2;
    }
}

interface LambdaTest {
    void lamTest();
}