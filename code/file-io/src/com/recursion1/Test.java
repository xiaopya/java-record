package com.recursion1;

import java.io.File;

/**
 * @projectName: code
 * @package: com.recursion1
 * @className: FileInputStreamTest1
 * @author: chenYongLong
 * @description: TODO 删除非空文件，递归删除
 * @date: 2024/1/20 17:24
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        deleteFile(new File("C:\\Users\\48676\\Desktop\\测试"));
    }

    public static void deleteFile(File dir) {
        // 判断当前路径是否存在
        if (dir == null || !dir.exists()) {
            return;
        }

        // 判断当前是否是一个文件
        if (dir.isFile()) {
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                deleteFile(file);
            }
        }
        // 当前所有文件全部上完之后，最后把自己删掉
        dir.delete();
    }
}
