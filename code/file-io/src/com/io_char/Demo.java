package com.io_char;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @projectName: java学习记录
 * @package: com.io_char
 * @className: Demo
 * @author: cyl
 * @description: TODO 将old文件的内容写到新的文件里，并排序
 * @date: 2024/1/20 21:22
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("code\\file-io\\src\\com\\io_char\\old.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("code\\file-io\\src\\com\\io_char\\new.txt"));
        ) {
            // 创建一个list集合用来存储读取的内容
            List<String> list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            // 将读取到的内容进行排序
            Collections.sort(list);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("写入成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
