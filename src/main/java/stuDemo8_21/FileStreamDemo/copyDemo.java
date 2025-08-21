package stuDemo8_21.FileStreamDemo;

import java.io.*;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class copyDemo {
/**
 * 主方法：演示文件复制功能，并计算复制操作所需时间
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建文件输入流，读取源文件
        FileInputStream fis=new FileInputStream(new File("D:\\Chen\\Documents\\D\\01 Code technology\\Mysql\\分页.md"));
    // 创建文件输出流，写入目标文件
        FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\Chen\\Desktop\\a.md"));
    // 定义变量b，用于存储每次读取的字节
        int b=0;
    // 记录开始时间
        long time1 = System.currentTimeMillis();
    // 循环读取源文件内容，直到文件末尾
        while ((b=fis.read())!=-1){
        // 将读取的字节写入目标文件
            fos.write(b);
        }

    // 记录结束时间
        long time2 = System.currentTimeMillis();
    // 输出文件复制所用的时间（毫秒）
        System.out.println(time2-time1);

    // 关闭输出流
        fos.close();
    // 关闭输入流
        fis.close();
    }
}
