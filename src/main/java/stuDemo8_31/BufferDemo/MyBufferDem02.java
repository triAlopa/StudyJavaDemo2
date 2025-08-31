package stuDemo8_31.BufferDemo;

import java.io.*;

public class MyBufferDem02 {
/**
 * 主方法：实现文件复制功能
 * 使用缓冲流读取源文件并写入目标文件
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建缓冲输入流，读取源文件a.txt
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/a.txt"));
    // 创建缓冲输出流，写入目标文件c.txt
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/c.txt"));

    // 创建字节数组作为缓冲区，大小为1024字节
        byte[] bytes=new byte[1024];
    // 用于记录每次读取的字节数
        int len=0;
    // 循环读取源文件内容，直到文件末尾
        while ((len= bis.read(bytes))!=-1){
        // 将读取的内容写入目标文件
            bos.write(bytes,0,len);
        }
    // 关闭输出流
        bos.close();
    // 关闭输入流
        bis.close();
    }
}
