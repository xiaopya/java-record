package com.encapsulation;

/**
 * 封装
 * 合理隐藏，合理公开
 */
public class Student {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
