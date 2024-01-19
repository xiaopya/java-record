    package com.data_stream;

    import java.io.*;

    /**
     * @projectName: java学习记录
     * @package: com.data_stream
     * @className: DataOutputStreamTest1
     * @author: cyl
     * @description: TODO 数据输入流
     * @date: 2024/1/20 23:01
     * @version: 1.0
     */
    public class DataOutputStreamTest1 {
        public static void main(String[] args) {
            try (
                    DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\develop\\java学习记录\\code\\file-io\\src\\com\\data_stream\\test.txt"));
            ) {
                // 会在文件里面生成一个特殊的类型，需要特殊的读取才可以
                dos.writeInt(14);
                dos.writeUTF("java");
                dos.writeBoolean(true);
                dos.writeChar('哈');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
