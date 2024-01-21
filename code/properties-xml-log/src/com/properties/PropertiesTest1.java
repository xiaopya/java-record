package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @projectName: java学习记录
 * @package: com.properties
 * @className: PropertiesTest1
 * @author: cyl
 * @description: TODO properties文件读取
 * @date: 2024/1/21 12:20
 * @version: 1.0
 */
public class PropertiesTest1 {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            System.out.println(properties);
            // 加载这个属性配置文件，再去读取里面的内容
            properties.load(new FileInputStream("code\\properties-xml-log\\src\\com\\properties\\user.properties"));
            System.out.println(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
