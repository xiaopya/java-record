package com.object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @projectName: java学习记录
 * @package: com.object_stream
 * @className: ObjectOutputStreamTest1
 * @author: cyl
 * @description: TODO 对象字节输出流 （序列化）
 * @date: 2024/1/20 23:11
 * @version: 1.0
 */
public class ObjectOutputStreamTest1 {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("code\\file-io\\src\\com\\object_stream\\test.txt"));
                ){
            User us = new User("测试",1,2,"96247477777");
            // 如果需要序列化一个对象的话，这个对象就需要实现一个接口叫 Serializable，才可以
            oos.writeObject(us);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
