package com.contructor;

/**
 * 如果手动写了一个有参数的构造器，那么需要把无参数构造器给写出来，因为一旦有了有参数构造器，
 * 在调用这个类的时候，不会自动帮忙写无参数构造器了
 */
public class Student {
    String name;

    public Student(){
        System.out.println("无参数构造器运行了");
    }
    public  Student(String name){
        this.name = name;
        System.out.println("有参数构造器运行了");
    }
}
