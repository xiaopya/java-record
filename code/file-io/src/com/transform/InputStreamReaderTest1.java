package com.transform;

import java.io.*;

/**
 * @projectName: java学习记录
 * @package: com.transform
 * @className: InputStreamReaderTest1
 * @author: cyl
 * @description: TODO 字符转换流，解决编码不同时，乱码的问题
 * @date: 2024/1/20 22:11
 * @version: 1.0
 */
public class InputStreamReaderTest1 {
    public static void main(String[] args) throws Exception {
        try (
                InputStream ist = new FileInputStream("code\\file-io\\src\\com\\transform\\gbk.txt");
                Reader dd = new InputStreamReader(ist, "GBK");
                BufferedReader br = new BufferedReader(dd);
        ) {
            String line;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
