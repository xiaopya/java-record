package com.recursion;

import java.io.File;
import java.io.IOException;

/**
 * @projectName: code
 * @package: com.recursion
 * @className: FileInputStreamTest1
 * @author: chenYongLong
 * @description: TODO 递归查找指定文件
 * @date: 2024/1/20 16:46
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 找到的结果：D:\enjoy\yuanshen\Genshin Impact\Genshin Impact Game\YuanShen.exe
        try {
            searchFile(new File("D:/"),"YuanShen");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchFile(File dir, String fileName) throws Exception {
        // 判断当前dir是否存在,它是不是一个文件对象，是不是一个文件夹
        if (dir == null || !dir.exists()) {
            return;
        }

        // 拿到所有的文件对象
        File[] files = dir.listFiles();
        // 判断当前文件对象是否存在
        if (files != null) {
            for (File file : files) {
                // 判断拿到的文件对象是文件还是文件夹
                if(file.isFile()){
                    // 拿到文件名称看看是否包含需要查找的那个文件
                    if(file.getName().contains(fileName)){
                        // 找到了之后 返回当前文件的绝对路径
                        System.out.println(file.getAbsolutePath());
                        // 然后再去启动该文件程序
                        // Runtime runtime = Runtime.getRuntime();
                        // runtime.exec(file.getAbsolutePath());
                    }
                }else{
                    // 如果是文件夹的话，需要递归重新查找
                    searchFile(file,fileName);
                }
            }
        }
    }
}
