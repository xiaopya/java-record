package com.d7_generics;

public class MyArrayList<E> {
    Object[] objects = new Object[10];
    private int size;

    public void add(E e){
        objects[size++] = e;
    }

    public E get(int index){
        return (E) objects[index];
    }
}
