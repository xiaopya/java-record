package com.io_char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * @projectName: java学习记录
 * @package: com.io_char
 * @className: FileReaderTest1
 * @author: cyl
 * @description: TODO 字符流,专门读取文本，不会乱码，性能好
 * @date: 2024/1/20 20:26
 * @version: 1.0
 */
public class FileReaderTest1 {
    public static void main(String[] args) throws Exception {

        try (
                Reader fr = new FileReader("code\\file-io\\src\\com\\io_char\\测试.txt");
        ) {
            char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
