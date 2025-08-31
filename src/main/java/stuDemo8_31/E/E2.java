package stuDemo8_31.E;

import java.io.*;

public class E2 {
/**
 * 主方法，演示使用缓冲流进行文件复制操作
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建缓冲输入流，读取源文件"src/csb.txt"
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/csb.txt"));
    // 创建缓冲输出流，写入目标文件"src/csb2.txt"
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/csb2.txt"));

    // 定义一个整型变量a，被注释掉了，用于单字节读取方式
//        int a=0;
    // 定义len变量，用于记录每次读取的字节数
        int len=0;
    // 创建字节数组作为缓冲区，大小为1024字节
        byte[] bytes=new byte[1024];
    // 记录开始时间，用于计算文件复制耗时
        long l1 = System.currentTimeMillis();
    // 以下被注释的代码是单字节读取和写入的方式，效率较低
//        while ((a=bis.read())!=-1){//1
//            bos.write(a);
//        }

    // 使用缓冲区进行批量读取和写入，提高效率
        while ((len=bis.read(bytes))!=-1){//0
            bos.write(bytes,0,len);
        }

    // 记录结束时间
        long l2 = System.currentTimeMillis();
    // 关闭输出流
        bos.close();
    // 关闭输入流
        bis.close();
    // 输出文件复制耗时（毫秒）
        System.out.println((l2-l1));
    }
}
