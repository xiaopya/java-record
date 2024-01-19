package com.io_char;

import java.io.*;

/**
 * @projectName: java学习记录
 * @package: com.io_char
 * @className: BufferedReaderTest3
 * @author: cyl
 * @description: TODO 字符缓冲输入流
 * @date: 2024/1/20 21:04
 * @version: 1.0
 */
public class BufferedReaderTest3 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("code\\file-io\\src\\com\\io_char\\writer生成文件.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {
            // 循环读取每一行，进行输出
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
