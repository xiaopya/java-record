package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: java学习记录
 * @package: com.logback
 * @className: Logback
 * @author: cyl
 * @description: TODO logback 日志框架
 * @date: 2024/1/21 13:24
 * @version: 1.0
 */
public class Logback {

    public static final Logger LOG = LoggerFactory.getLogger("test");

    public static void main(String[] args) {
        try {
            LOG.info("开始测试日志...");
            test(2, 5);
        } catch (Exception e) {
            LOG.error("方法执行失败了...");
        }
    }

    public static void test(int a, int b) {
        LOG.debug("test " + a + " " + b);
        int c = a / b;
        LOG.info("结果是：" + (a/b));
    }
}
