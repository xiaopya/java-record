package com.io_char;

import java.io.*;

/**
 * @projectName: java学习记录
 * @package: com.io_char
 * @className: FileWriterTest2
 * @author: cyl
 * @description: TODO 文件字符输出流
 * @date: 2024/1/20 20:35
 * @version: 1.0
 */
public class FileWriterTest2 {
    public static void main(String[] args) throws Exception {
        try (
                // 默认是覆盖，后面加一个true就是追加内容
                Writer fw = new FileWriter("code\\file-io\\src\\com\\io_char\\writer生成文件.txt",true);
        ) {
            fw.write("hello world");
            // 换行
            fw.write("\r\n");

            // 刷新流,他会吧数据全部放到缓冲区里面，再立即吧数据写到文件中去
            // fw.flush();
            // 直接关闭就可以，关闭流的时候，他包含了刷新流
            fw.close();
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
