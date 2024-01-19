package com.io_byte;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @projectName: java学习记录
 * @package: com.io
 * @className: FileOutputStreamTest2
 * @author: cyl
 * @description: TODO 文件字节输出流
 * @date: 2024/1/20 19:34
 * @version: 1.0
 */
public class FileOutputStreamTest2 {
    public static void main(String[] args) throws Exception {
        // 默认是覆盖文件的内容，后面加一个 true 是追加内容
        OutputStream os = new FileOutputStream("code\\file-io\\src\\com\\io\\测试文件.txt",true);

        byte[] bytes = "你好啊小朋友".getBytes();
        os.write(bytes);

        // 写入3个字节进去
        os.write(bytes,0,3);

        os.close();
    }
}
