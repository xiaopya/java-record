package com.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @projectName: java学习记录
 * @package: com.tcp
 * @className: Server
 * @author: cyl
 * @description: TODO TCP通信
 * @date: 2024/1/22 19:59
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws Exception {
        try (
                ServerSocket serverSocket = new ServerSocket(8888);
        ) {
            // 等待客户端链接请求
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            // 读取客户端的数据
            String rs = dis.readUTF();
            System.out.println(rs + " " + socket.getRemoteSocketAddress());
            dis.close();
            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
