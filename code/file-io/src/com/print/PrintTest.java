package com.print;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @projectName: java学习记录
 * @package: com.print
 * @className: PrintTest
 * @author: cyl
 * @description: TODO 打印流
 * @date: 2024/1/20 22:31
 * @version: 1.0
 */
public class PrintTest {
    public static void main(String[] args) throws Exception {
        try (
                // 后面可以接受一个类型
                // PrintStream ps = new PrintStream("code\\file-io\\src\\com\\print\\PrintStream生成文件.txt", Charset.forName("UTF-8"));
                // PrintStream ps = new PrintStream("code\\file-io\\src\\com\\print\\PrintStream生成文件.txt");
                // 默认向文件覆盖内容
                // PrintWriter pw = new PrintWriter("code\\file-io\\src\\com\\print\\PrintStream生成文件.txt");
                // 如果想追加内容，就需要包装成低级流
                PrintWriter pw = new PrintWriter(new FileOutputStream("code\\file-io\\src\\com\\print\\PrintStream生成文件.txt",true));
        ) {
            pw.println("测试");
            pw.println("哈喽啊");
            pw.println("哈喽1111啊");
            pw.println(111);
            pw.println(true);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
