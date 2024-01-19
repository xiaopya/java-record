package com.transform;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @projectName: java学习记录
 * @package: com.transform
 * @className: OutputStreamWriterTest2
 * @author: cyl
 * @description: TODO 字符输出转换流,写出去的字符使用什么编码
 * @date: 2024/1/20 22:22
 * @version: 1.0
 */
public class OutputStreamWriterTest2 {
    public static void main(String[] args) throws Exception {
        try(
                OutputStream os = new FileOutputStream("code\\file-io\\src\\com\\transform\\new_gbk.txt");
                Writer osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                ) {
            bw.write("你好");
            bw.newLine();

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
