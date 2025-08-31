package stuDemo8_31.BufferDemo;

import java.io.*;

public class MyBufferDem01 {
/**
 * 主方法，用于演示使用缓冲流进行文件复制操作
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建缓冲输入流，读取源文件a.txt
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/a.txt"));
    // 创建缓冲输出流，将数据写入目标文件b.txt
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/b.txt"));

        int a=0;
    // 循环读取源文件内容，直到文件末尾
        while ((a=bis.read())!=-1){
        // 将读取到的字节写入目标文件
            bos.write(a);
        }
    // 关闭输出流
        bos.close();
    // 关闭输入流
        bis.close();
    }
}
