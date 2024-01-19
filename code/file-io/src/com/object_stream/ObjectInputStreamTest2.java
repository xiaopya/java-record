package com.object_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @projectName: java学习记录
 * @package: com.object_stream
 * @className: ObjectOutputStreamTest1
 * @author: cyl
 * @description: TODO 对象字节输入流 (反序列化)
 * @date: 2024/1/20 23:11
 * @version: 1.0
 */
public class ObjectInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("code\\file-io\\src\\com\\object_stream\\test.txt"));
        ) {
            User u = (User)ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
