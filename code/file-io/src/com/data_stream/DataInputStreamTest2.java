package com.data_stream;

import java.io.*;

/**
 * @projectName: java学习记录
 * @package: com.data_stream
 * @className: DataOutputStreamTest1
 * @author: cyl
 * @description: TODO 数据输入流
 * @date: 2024/1/20 23:01
 * @version: 1.0
 */
public class DataInputStreamTest2 {
    public static void main(String[] args) {
        try (
                DataInputStream dos = new DataInputStream(new FileInputStream("D:\\develop\\java学习记录\\code\\file-io\\src\\com\\data_stream\\test.txt"));
        ) {
            // 这里读取的时候，需要按照写入的类型 对应上 不然会出问题
            int s1 = dos.readInt();
            System.out.println(s1);

            String s2 = dos.readUTF();
            System.out.println(s2);

            boolean s3 = dos.readBoolean();
            System.out.println(s3);

            char s4 = dos.readChar();
            System.out.println(s4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
