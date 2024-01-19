package com.basics.demo3;

/**
 * @author liziyuan
 */
@FunctionalInterface
public interface MyConsumer<E> {
    void accept(E e);
}
