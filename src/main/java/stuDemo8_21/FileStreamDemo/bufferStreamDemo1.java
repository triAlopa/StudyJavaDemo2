package stuDemo8_21.FileStreamDemo;

import java.io.*;

public class bufferStreamDemo1 {
/**
 * 主方法，演示使用Java进行文件复制操作
 * 使用try-with-resources语句自动关闭资源
 * 捕获并处理可能出现的IO异常
 *
 * @param args 命令行参数
 * @throws FileNotFoundException 如果源文件不存在
 */
    public static void main(String[] args) throws FileNotFoundException {
        //jdk 1.7 使用try-with-resources自动管理资源
        int read=0; // 记录每次读取的字节数


    // 使用try-with-resources语句，自动关闭FileInputStream和FileOutputStream
        try (FileInputStream fis = new FileInputStream(new File("D:\\Chen\\Documents\\D\\01 Code technology\\Mysql\\视图.md"));
             FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Chen\\Desktop\\a.md"))){
        // 创建字节数组作为缓冲区，大小为1024字节
             byte[] bytes=new byte[1024];
        // 从输入流中读取数据到bytes数组中，返回实际读取的字节数
             read = fis.read(bytes);
        // 将读取到的字节数据写入输出流，从0开始，长度为read
             fos.write(bytes,0,read);
        }catch (IOException e){
        // 捕获并打印IO异常信息
            e.printStackTrace();

        }
    }
}
