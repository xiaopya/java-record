package com.io_char;

import java.io.*;

/**
 * @projectName: java学习记录
 * @package: com.io_char
 * @className: BufferedReaderTest3
 * @author: cyl
 * @description: TODO 字符缓冲输出流
 * @date: 2024/1/20 21:04
 * @version: 1.0
 */
public class BufferedWriterTest4 {
    public static void main(String[] args) throws Exception {
        try (
                Writer fw = new FileWriter("code\\file-io\\src\\com\\io_char\\BufferedWriter生成文件.txt");
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write("你好啊我在给你写入数据");
            // 换行，新增的方法
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
