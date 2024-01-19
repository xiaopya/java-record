package com.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @projectName: java学习记录
 * @package: com.print
 * @className: PrintTest2
 * @author: cyl
 * @description: TODO 重定向System.out.println 方法，让他支持打印的时候将内容写入到文件中
 * @date: 2024/1/20 22:50
 * @version: 1.0
 */
public class PrintTest2 {
    public static void main(String[] args) {

        try (
                PrintStream ps = new PrintStream("code\\file-io\\src\\com\\print\\println生成文件.txt");
        ) {
            // 修改了下面打印的方法
            System.setOut(ps);
            // 每次打印都会写到上面的文件里面
            System.out.println("我是内容");
            System.out.println("我是内容1");
            System.out.println("我是内容2");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
