package com.d9_extends_constructor;


class Father{
//    public Father(){
//        //super(); // 默认调用
//        System.out.println("我是father，我执行了");
//    }

    public Father(String name){

    }
}
class Son extends Father {
    public Son(){
        //super(); // 默认调用
        super("张三"); // 因为父类没有无参数构造器，就需要手动加上super关键字，并且传入参数 手动调用有参数构造器
        System.out.println("我是son，执行了");
    }
}


/**
 * 子构造器的特点
 * 子类一旦继承父类，子类的构造器一旦调用，会先去调用父类的构造器，再去执行之类的构造器
 * 因为在每个子类构造器里面默认调用了 super();
 * 如果父类只有有参数构造器，没有无参数构造器，子类就需要在构造器里面的 super(写上参数) 去掉用父类的有参数构造器
 */
public class Test1 {
    public static void main(String[] args) {
        Son s = new Son();
        // 执行结果：
        // 我是father，我执行了
        // 我是son，执行了
    }
}
