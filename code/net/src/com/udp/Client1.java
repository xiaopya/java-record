package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @projectName: java学习记录
 * @package: com.udp
 * @className: Client
 * @author: cyl
 * @description: TODO 客户端（UDP通信）
 * @date: 2024/1/22 19:22
 * @version: 1.0
 */
public class Client1 {
    public static void main(String[] args)throws Exception {
        try (
                // 客户端对象
                DatagramSocket socket = new DatagramSocket();
        ) {
            /*
              public DatagramPacket(byte buf[], int length,InetAddress address, int port)
              参数1：封装要发送出去的数据
              参数2：发送出去的数据大小（字节个数）
              参数三：服务端的IP地址（找到服务端的主机）
              参数四：服务端程序的端口
             */
            Scanner sc = new Scanner(System.in);
            // 创建数据包
            System.out.println("退出请输入exit");
            while (true) {
                System.out.println("我(cyl)：");
                String msg = sc.next();
                if("exit".equals(msg)){
                    System.out.println("退出成功!");
                    break;
                }
                byte[] bytes = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);
                socket.send(packet);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }
}
