package com.d4_temp;

/**
 * 需求是每个人都需要写一份作文，作文的开头和结尾已经给出来了，但是主题内容没有，
 * 每个人的内容都是不一样的，需要设计一个模板 供他们使用
 */
public abstract class People {
    private String name;

    /* 这里的开头和结尾是固定好的，需要提供给所有的子类去用，这个时候就需要用到final来修饰，避免子类重写该方法 */
    public final void write(){
        System.out.println("我是开头");
        body();
        System.out.println("我是结尾");
    }

    /* 因为每个人都需要写主题内容，但是都不一样，这个时候就可以定义一个抽象方法，提供给他们去重写主题内容 */
    public abstract void body();
}
