package com.charset;

import java.util.Arrays;

/**
 * @projectName: java学习记录
 * @package: com.charset
 * @className: FileInputStreamTest1
 * @author: chenYongLong
 * @description: TODO 字符编码何解码
 * @date: 2024/1/20 18:13
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 编码
        String data = "ab你好c";
        // 默认是按照UTF-8进行编码，中文是3个字节
        byte[] bytes = data.getBytes();
        System.out.println(Arrays.toString(bytes));

        // 按照指定字符集进行编码,在GBK中中文是2个字节
        String data1 = "测试a";
        byte[] bytes1 = data1.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        // 解码
        String ss = new String(bytes);
        System.out.println(ss);

        String ss1 = new String(bytes1,"GBK");
        System.out.println(ss1);
    }
}
