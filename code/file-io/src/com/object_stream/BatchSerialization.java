package com.object_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @projectName: java学习记录
 * @package: com.object_stream
 * @className: BatchSerialization
 * @author: cyl
 * @description: TODO 批量序列化 多个对象
 * @date: 2024/1/20 23:32
 * @version: 1.0
 */
public class BatchSerialization {

    public static List<Object> list = new ArrayList<Object>();

    public static void main(String[] args) {
         User us = new User("测试", 1, 2, "96247477777");
         User1 us1 = new User1("测试", 1, 2, "96247477777");
         User2 us2 = new User2("测试", 1, 2, "96247477777");

         Collections.addAll(list, us, us1, us2);

        String filePath = "code\\file-io\\src\\com\\object_stream\\batchSerializationTest.txt";

        // 写入对象
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 读取对象
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
