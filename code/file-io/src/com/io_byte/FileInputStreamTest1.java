package com.io_byte;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @projectName: java学习记录
 * @package: com.io
 * @className: FileInputStreamTest1
 * @author: cyl
 * @description: TODO io流的介绍
 * @date: 2024/1/20 18:25
 * @version: 1.0
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // i -> 指input，输入流，负责吧数据读到内存中去
        // o -> 指output，输出流，负责把数据写到磁盘中去
        // FileInputStream fis = new FileInputStream("code\\file-io\\src\\com\\io\\test.txt");
        // read 会按照文件内容一个字节一个字节的读取，如果读取不到会返回 -1.
        // int f1 = fis.read();
        // System.out.println((char)f1);
        // int f2 = fis.read();
        // System.out.println((char)f2);
        // int f3 = fis.read();
        // System.out.println(f3);

        // 循环读取文件中的内容
        // int b;
        // while((b=fis.read()) != -1){
        //     System.out.print((char)b);
        // }
        // 释放资源
        // fis.close();

        System.out.println("--------------------------------");

        InputStream is = new FileInputStream("code\\\\file-io\\\\src\\\\com\\\\io\\\\test.txt");

        // 定义每次读取的字节数量
        // byte[] buffer = new byte[3];
        // int len = is.read(buffer);
        // String rs = new String(buffer);
        // System.out.println(rs);
        // System.out.println("当前读取的字节数："+len);

        // int len2 = is.read(buffer);
        // // 这里要注意一点：每次读取多少，就要拿多少，如果最后读取的位置不够的话，会把上一次读取的结果最后一个字节数补充到最后一次中
        // String rs1 = new String(buffer,0,len2);
        // System.out.println(len2);
        // System.out.println(rs1);

        // 循环改造
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1){
            String rs = new String(buffer,0,len);
            System.out.print(rs);
        }

        // 关闭流，释放资源
        is.close();

    }
}
