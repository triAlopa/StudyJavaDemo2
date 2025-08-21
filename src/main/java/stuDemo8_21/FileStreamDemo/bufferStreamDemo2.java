package stuDemo8_21.FileStreamDemo;

import java.io.*;

public class bufferStreamDemo2 {
    //Jdk 1.9
    public static void main(String[] args) throws FileNotFoundException {
        int read=0; // 用于记录每次读取的字节数
        // 创建FileInputStream对象，用于读取源文件
        FileInputStream fis = new FileInputStream(new File("D:\\Chen\\Documents\\D\\01 Code technology\\Mysql\\视图.md"));
        // 创建FileOutputStream对象，用于写入目标文件
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Chen\\Desktop\\a.md"));
        // 使用try-with-resources语句，自动关闭资源
        try (fis;fos){
            // 创建字节数组，作为缓冲区，大小为1024字节
            byte[] bytes=new byte[1024];
            // 从输入流中读取数据到字节数组，返回读取的字节数
            read = fis.read(bytes);
            // 将读取到的字节数据写入输出流
            fos.write(bytes,0,read);
        }catch (IOException e){
            // 捕获并打印IO异常信息
            e.printStackTrace();

        }
    }
}
