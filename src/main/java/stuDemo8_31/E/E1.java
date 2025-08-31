package stuDemo8_31.E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1 {
/**
 * 主方法：演示文件复制操作，使用字节流进行文件读写，并计算复制所需时间
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建文件输入流，读取源文件"src/csb.txt"
        FileInputStream fis=new FileInputStream(new File("src/csb.txt"));
    // 创建文件输出流，写入目标文件"src/csb1.txt"
        FileOutputStream fos=new FileOutputStream("src/csb1.txt");
    // 注释：定义单个字节变量，此处代码被注释掉
//        int a=0;
    // 定义变量len，用于记录每次读取的字节数
        int len=0;
    // 创建字节数组作为缓冲区，大小为1024字节
        byte[] bytes=new byte[1024];
    // 记录开始时间，用于计算文件复制耗时
        long l1 = System.currentTimeMillis();
    // 注释：以下是逐字节读取和写入的代码，效率较低
//        while ((a=fis.read())!=-1){//12
//            fos.write(a);
//        }
    // 使用缓冲区批量读取和写入文件，提高效率
    // 当读取到文件末尾时，read()方法返回-1
        while ((len=fis.read(bytes))!=-1){//0
        // 将读取到的字节写入目标文件，只写入有效长度(len)的数据
            fos.write(bytes,0,len);
        }
    // 记录结束时间
        long l2 = System.currentTimeMillis();
    // 关闭输出流
        fos.close();
    // 关闭输入流
        fis.close();

    // 打印文件复制耗时（毫秒）
        System.out.println((l2-l1));
    }
}
