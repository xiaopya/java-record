package com.proxy;

/**
 * @projectName: java学习记录
 * @package: com.proxy
 * @className: Demo
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/22 22:26
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        BigStar s = new BigStar("杨超越");
        Star starProxy = ProxyUtil.createProxy(s);
        starProxy.dance();
        starProxy.sing();
    }
}
