package com.xml.xml_test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @projectName: java学习记录
 * @package: com.xml.xml_test
 * @className: Test
 * @author: cyl
 * @description: TODO Dom4j框架使用 解析xml文件
 * @date: 2024/1/21 13:01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        SAXReader saxReader = new SAXReader();
        // 使用saxReader将需要解析的xml文件解析成Document对象
        Document document = saxReader.read("code\\properties-xml-log\\src\\com\\xml\\xml_test\\xml_test.xml");
        Element root = document.getRootElement();
        System.out.println(root.getName());
        // ....
    }
}
