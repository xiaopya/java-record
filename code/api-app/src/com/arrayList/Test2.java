package com.arrayList;

import java.util.ArrayList;

/**
 * 购物车删除包含某个关键字的商品
 * 这里包含需要用到 contains
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("花生");
        list.add("枸杞");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("枸杞子");
        list.add("桃子");
        list.add("橘子");
        System.out.println(list);

        // 方法1
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("枸杞")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        // 方法2 倒着删除
        // for (int i = list.size() - 1 ;  i >= 0; i--) {
        //     if(list.get(i).contains("枸杞")){
        //         list.remove(i);
        //     }
        // }
        // System.out.println(list);
    }
}
