package com.basics.demo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @projectName: code
 * @package: com.basics.demo2
 * @className: Demo
 * @author: chenYongLong
 * @description: TODO 作业2
 * @date: 2024/1/19 19:40
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        // 根据一下字符串，将他存储到User实体类中
        // 再利用map集合，输出每个名字出现的次数
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";

        List<User> list = new ArrayList<>();
        // 1.按照字段的 # 给他们先拆开
        String[] userInfo = userStrs.split("#");
        // s = "10001:张三:男:1990-01-01";
        for (String s : userInfo) {
            // userData = ["10001","张三","男","1990-01-01"];
            String[] userData = s.split(":");
            User user = new User();
            user.setId(Long.valueOf(userData[0]));
            user.setName(userData[1]);
            user.setGender(userData[2]);
            user.setBirthday(LocalDate.parse(userData[3]));
            list.add(user);
        }

        System.out.println("处理后的数据：" + list);

        // 计算名称出现的次数
        Map<String, Integer> map = new HashMap<>();
        for (User user : list) {
            if (map.containsKey(user.getName())) {
                map.put(user.getName(), map.get(user.getName()) + 1);
            } else {
                map.put(user.getName(), 1);
            }
        }

        map.forEach((k, v) -> {
            System.out.println(k + ": " + v + "次");
        });

    }
}
