package com.commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @projectName: java学习记录
 * @package: com.commons_io
 * @className: CommonsIO
 * @author: cyl
 * @description: TODO commons-io框架(右键lib文件 点击 add as library 让包和当前融合到一起，可以直接用外部框架)
 * @date: 2024/1/20 23:53
 * @version: 1.0
 */
public class CommonsIO {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("code\\file-io\\src\\com\\commons_io\\test.txt"),new File("code\\file-io\\src\\com\\commons_io\\newTest.txt"));
        // ....
        // 呜呜呜呜，白雪啊。。。。框架太好用了，真白雪啊  ，，，，，，，，，

        // 官方也提供了，真白雪啊，前面
        Files.copy(new File("code\\file-io\\src\\com\\commons_io\\test.txt").toPath(), new File("code\\file-io\\src\\com\\commons_io\\newFiles.txt").toPath());

    }
}
