package com.d5_enum;

/**
 * 枚举的构造器都是私有的
 */
public enum A {
    x;

    A getObject() {
        return x;
    }
}
