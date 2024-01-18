package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    private List<Card> list = new ArrayList<>();

    public Room() {
        String[] numbers = {"3","4","5","6","7","8","9","10","J", "Q", "K", "A","2"};
        String[] colors = {"桃","心","梅花","方块"};
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number, color,size);
                list.add(c);
            }
        }
        Card c1 = new Card("", "小王",++size);
        Card c2 = new Card("", "大王",++size);
        Collections.addAll(list,c1,c2);

        System.out.println("新牌：" + list);
    }

    public void start(){
        Collections.shuffle(list);
        System.out.println("打乱后的牌：" + list);

        List<Card> xiaohong = new ArrayList<>();
        List<Card> xiaolv = new ArrayList<>();
        List<Card> xiaozi = new ArrayList<>();

        // 需要给三个人发牌，需要留3张牌给地主
        for (int i = 0; i < list.size() - 3; i++) {
            Card card = list.get(i);
            switch (i%3){
                case 0:
                    xiaohong.add(card);
                    break;
                case 1:
                    xiaolv.add(card);
                    break;
                case 2:
                    xiaozi.add(card);
                    break;
            }
        }

        // 取出最后三张牌
        List<Card> lastThreeCard = list.subList(list.size() - 3, list.size());

        //给他们的牌排好序

        cardSort(xiaohong);
        cardSort(xiaolv);
        cardSort(xiaozi);

        System.out.println("小红：" + xiaohong);
        System.out.println("小绿：" + xiaolv);
        System.out.println("小紫：" + xiaozi);
        System.out.println("最后三张牌：" + lastThreeCard);

        System.out.println("恭喜小红是地主");

        xiaohong.addAll(lastThreeCard);
        cardSort(xiaohong);
        System.out.println("小红抢到地主后的牌：" + xiaohong);
    }

    public void cardSort(List<Card> list){
        Collections.sort(list, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();
            }
        });
    }
}
