package com.basics.demo3;

import java.util.Arrays;

/**
 * @projectName: code
 * @package: com.basics.demo3
 * @className: MyArrayList
 * @author: chenYongLong
 * @description: TODO
 * @date: 2024/1/19 20:51
 * @version: 1.0
 */
public class MyArrayList<E> {
    private  Object[] elements = {};
    private  int size;
    /**
     * 默认容量
     */
    private  int DEFAULT_CAPACITY = 10;

    public boolean add(E e) {
        // 判断是否需要扩容
        if (size == elements.length) {
            grow();
        }

        elements[size++] = e;
        return true;
    }

    public E get(int index) {
        // 越界判断
        checkIndex(index);
        return (E) elements[index];
    }

    public E remove(int index) {
        // 越界
        checkIndex(index);
        E e = (E) elements[index];
        // 移动元素
         for(int i = index; i < size - 1; i++){
             elements[i] = elements[i + 1];
         }
         // 最后一个元素置为null
         elements[size - 1] = null;

        //int move = size - index - 1;
        //if(move != 0){
        //    System.arraycopy(elements, index + 1, elements, index, move);
        //}
        elements[--size] = null;
        return e;
    }

    public int size(){
        return size;
    }


    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("The index is out of bounds. The current maximum size is：" + index);
        }
    }

    private void grow() {
        // 首次扩容
        if (size == 0) {
            elements = new Object[DEFAULT_CAPACITY];
        } else {
            // 每次扩容都是上一次的1.5倍
            elements = Arrays.copyOf(elements, elements.length + elements.length >> 1);
        }
    }

    public void forEach(MyConsumer<E> action){
        for (int i = 0; i < size; i++) {
            action.accept((E) elements[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]).append(i == size -1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
