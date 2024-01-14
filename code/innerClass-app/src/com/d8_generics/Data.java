package com.d8_generics;


import java.util.ArrayList;

public interface Data<T extends Animal> {
    void add(T t);
    ArrayList<T> getByArrayLIst();
}
