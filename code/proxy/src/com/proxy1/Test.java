package com.proxy1;

/**
 * @projectName: java学习记录
 * @package: com.proxy1
 * @className: Test
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/22 22:43
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("大幂幂");
        Star s = ProxyUtil.creatProxy(bigStar);
        s.dance();
        s.sing();
    }
}
