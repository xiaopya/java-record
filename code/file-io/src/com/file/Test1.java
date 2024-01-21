package com.file;

import java.io.File;

/**
 * @projectName: code
 * @package: com.file1
 * @className: FileInputStreamTest3
 * @author: chenYongLong
 * @description: TODO file创建文件和删除文件相关方法
 * @date: 2024/1/20 16:24
 * @version: 1.0
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        File file = new File("file-io\\src\\com\\file1\\ceshi.txt");
        // 创建文件
        System.out.println(file.createNewFile());
        // 创建文件夹，创建一层文件夹
        File file1 = new File("file-io\\src\\com\\file1\\aaa");
        System.out.println(file1.mkdir());
        // 创建多层文件夹
        File file2 = new File("file-io\\src\\com\\file1\\ccc\\bbb\\ddd");
        System.out.println(file2.mkdirs());
        // 删除文件夹 不能删除 有内容的文件夹（删除后的文件无法进入回收站）
         File file3 = new File("file-io\\src\\com\\file1\\ccc");
        System.out.println(file3.delete());
    }
}
