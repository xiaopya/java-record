package com.file;

import java.io.File;

/**
 * @projectName: code
 * @package: com.file1
 * @className: FileInputStreamTest1
 * @author: chenYongLong
 * @description: TODO file方法介绍
 * @date: 2024/1/20 16:13
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 绝对路径（带有盘符，不推荐使用，一旦别人工程目录放到了c盘下面，就需要修改路径了）
        // File file = new File("D:/develop/code/file-io/src/com/file1/test.txt");
        // 相对路径
        File file = new File("file-io/src/com/file1/test.txt");
        // length 当前文件的大小
        System.out.println(file.length());

        File file1 = new File("aaaaa.txt");
        // exists 判断当前文件对象，对应的文件路径是否存在
        System.out.println(file1.exists());
        // 判断当前文件对象是否是文件
        System.out.println(file.isFile());
        // 判断当前文件对象是否是文件夹
        System.out.println(file.isDirectory());
        // 获取文件的后缀
        System.out.println(file.getName());
        // 获取文件最后修改的时间
        System.out.println(file.lastModified());
        // 获取 创建对象时使用的路径
        System.out.println(file.getPath());
        // 获取绝对路径
        System.out.println(file.getAbsolutePath());


    }
}
