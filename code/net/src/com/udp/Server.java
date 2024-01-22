package com.udp;

import java.net.*;

/**
 * @projectName: java学习记录
 * @package: com.udp
 * @className: Server
 * @author: cyl
 * @description: TODO 服务端（UDP通信）
 * @date: 2024/1/22 19:22
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端正在启动...");
        try (
                // 客户端对象
                DatagramSocket socket = new DatagramSocket(6666);
        ) {
           byte[] buffer = new byte[1024 * 64];
           DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            while (true) {
                socket.receive(packet);
                int len = packet.getLength();
                String rs = new String(buffer, 0, len);
                System.out.println(rs + " " + packet.getAddress().getHostAddress());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
