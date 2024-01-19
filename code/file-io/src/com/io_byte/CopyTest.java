package com.io_byte;

import java.io.*;

/**
 * @projectName: java学习记录
 * @package: com.io
 * @className: CopyTest
 * @author: cyl
 * @description: TODO 使用字节流复制文件（字节流很适合做一切文件的复制操作）
 * @date: 2024/1/20 19:41
 * @version: 1.0
 */
public class CopyTest {
    public static void main(String[] args) throws Exception {


        try (
                // 这里只能放资源对象（流对象）用完之后会自动调用close方法释放资源
                // 创建一个输入流，来获取需要拷贝的文件
                InputStream is = new FileInputStream("C:\\Users\\48676\\Pictures\\NSHM_PHOTO\\NSHM_PHOTO_2024_1_18_23_51_59.jpg");
                // 包装类 字节缓冲流，自带8kb缓冲区，提高性能
                InputStream bis = new BufferedInputStream(is);
                // 创建一个输出流，写入新的文件
                OutputStream os = new FileOutputStream("code\\file-io\\src\\com\\io\\逆水寒图片.jpg");
                // 包装类 字节缓冲流，自带8kb缓冲区，提高性能
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 创建字节数组
            byte[] buffer = new byte[1024];
            // 记住每次读取了多少字节
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
