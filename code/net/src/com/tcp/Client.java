package com.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @projectName: java学习记录
 * @package: com.tcp
 * @className: Client
 * @author: cyl
 * @description: TODO TCP通信
 * @date: 2024/1/22 19:59
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);
        // 字节输出流
        OutputStream os = socket.getOutputStream();
        // 将低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("在一起，好吗？");
        dos.close();
    }
}
