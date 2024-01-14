package com.d7_generics;

/**
 * 这里用泛型简单实现一下 ArrayList 类
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();

        arrayList.add("你好");
        arrayList.add("今天天气真好");

        System.out.println(arrayList.get(1));

        MyClass1<String, String> my1 = new MyClass1<>();

        // 这里的泛型是继承的，那么填写的类型就必须要是 继承Animal的，或者是Animal自己
        MyClass2<Dog> my2 = new MyClass2<>();
    }
}
