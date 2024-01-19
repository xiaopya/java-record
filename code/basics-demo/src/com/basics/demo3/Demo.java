package com.basics.demo3;

/**
 * @projectName: code
 * @package: com.basics.demo3
 * @className: Demo
 * @author: chenYongLong
 * @description: TODO 实现 ArrayList集合，支持扩容，支持lambda写法
 * @date: 2024/1/19 20:11
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("6");
        myArrayList.remove(1);
        System.out.println(myArrayList);
    }
}
