package com.io_byte;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @projectName: java学习记录
 * @package: com.io
 * @className: FileInputStreamTest3
 * @author: cyl
 * @description: TODO 一次性读取整个文件的内容（只能读取相对较小的，太大了不行）
 * @date: 2024/1/20 19:16
 * @version: 1.0
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        String path = "code\\file-io\\src\\com\\io\\test.txt";
        InputStream is = new FileInputStream(path);

        // File file = new File(path);
        // long size = file.length();
        // byte[] buffer = new byte[(int) size];
        // int len = is.read(buffer);
        // String rs = new String(buffer);
        // System.out.println(rs);
        // System.out.println(len);

        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));

        is.close();
    }
}
