package com.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: code
 * @package: com.map
 * @className: Test
 * @author: chenYongLong
 * @description: TODO map集合的用法
 * @date: 2024/1/18 21:04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

        // 用lambda表达式遍历
        map.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });

        // 获取map集合大小
        System.out.println(map.size());

        // 根据键获取对应的值
        System.out.println(map.get("b"));

        // 获取map集合的key值
        System.out.println(map.keySet());

        // 获取map集合的value值
        System.out.println(map.values());

        // 获取map集合的key和value值
        System.out.println(map.entrySet());

        // 获取map集合的key值
        System.out.println(map.keySet());

        // 获取map集合的value值
        System.out.println(map.values());

        // 获取map集合的key和value值
        System.out.println(map.entrySet());

        // 判断是否包含某个键
        System.out.println(map.containsKey("c"));

        // 判断是否包含某个值
        System.out.println(map.containsValue(4));
    }
}
