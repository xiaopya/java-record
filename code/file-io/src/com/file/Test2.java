package com.file;

import java.io.File;

/**
 * @projectName: code
 * @package: com.file1
 * @className: FileOutputStreamTest2
 * @author: chenYongLong
 * @description: TODO file遍历文件夹的方法
 * @date: 2024/1/20 16:32
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:/develop/code");

        // 获取当前目录下所有的”一级文件名称“到一个字符串数组中去返回。
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回
        File file1 = new File("D:/develop/code");
        File[] lists = file1.listFiles();
        for (File list1 : lists) {
            System.out.println(list1.getAbsolutePath());
        }
    }
}
