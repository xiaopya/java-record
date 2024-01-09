package com.arrayList;

import java.util.ArrayList;

/**
 * ArrayList的常用方法
 * public boolean add(E e)                              将指定的元素添加到此集合的末尾
 * public void add(intindex,Eelement)                   在此集合中的指定位置插入指定的元素
 * public E get(int index)                              返回指定索引处的元素
 * public int size()                                    返回集合中的元素的个数
 * public E remove(int index)                           删除指定索引处的元素，返回被删除的元素
 * public boolean remove(object o)                      删除指定的元素，返回删除是否成功
 * public E set(int index,E element)                    修改指定索引处的元素，返回被修改的元素
 */
public class Test1 {
    public static void main(String[] args) {
        // 1、这里的泛型String 是约束ArrayList存储的类型不写的话可以，添加任何类型，后面的<>里面的String可以省略
        ArrayList<String> list = new ArrayList<>();

        // 2、将指定的元素添加到此集合的末尾
        list.add("case"); // [case]
        list.add("case1"); // [case]
        list.add("case2"); // [case]
        System.out.println(list);

        // 2、在此集合中的指定位置插入指定的元素
        list.add(0,"插入");
        System.out.println(list); // [插入, case, case1, case2]

        // 3、返回指定索引处的元素
        String str = list.get(1);
        System.out.println(str); // case

        // 4、返回集合中的元素的个数
        int size = list.size();
        System.out.println(size); // 2

        // 5、删除指定索引处的元素，返回被删除的元素
        list.remove(0);
        System.out.println(list); // [case, case1, case2]

        // 6、删除指定的元素，返回删除是否成功
        boolean bool = list.remove("case1");
        System.out.println(bool); // true
        System.out.println(list); // [case, case2]

        // 6、修改指定索引处的元素，返回被修改的元素
        list.set(1,"修改了");
        System.out.println(list); // [case, 修改了]

    }
}
