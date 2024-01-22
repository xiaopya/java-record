package com.junit;

/**
 * @projectName: java学习记录
 * @package: com.junit
 * @className: StringUtil
 * @author: cyl
 * @description: TODO 单元测试
 * @date: 2024/1/22 20:25
 * @version: 1.0
 */
public class StringUtil {
    public static void printStringLength(String s){
        System.out.println("字符串的长度：" + s.length());
    }

    public static int getMaxIndex(String data){
        if(data == null){
            return -1;
        }

        return  data.length() -1;
    }
}
