package com.map;

import java.util.*;

/**
 * @projectName: code
 * @package: com.map
 * @className: Demo
 * @author: chenYongLong
 * @description: TODO 需求：80个学生选择{"A","B","C","D"}四个景点中的任何一个，每个人只能选择一次，统计出每个景点的人数。
 * @date: 2024/1/18 21:29
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Random r = new Random();
        List<String> lists = new ArrayList<>();
        String[] select = {"A","B","C","D"};
        // 先让80名同学选择景点，并存入lists集合中
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            lists.add(select[index]);
        }

        System.out.println(lists);

        // 使用map去除学生选择后的数据，并记录每个景点出现的次数
        Map<String,Integer> map = new HashMap<>();
        for (String s : lists) {
            // 先判断map集合里面有没有该键
            if(map.containsKey(s)){
                map.put(s,map.get(s) + 1);
            }else{
                map.put(s,1);
            }
        }

        System.out.println(map);
    }
}
