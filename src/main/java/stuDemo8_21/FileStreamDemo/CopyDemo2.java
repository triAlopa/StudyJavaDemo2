package stuDemo8_21.FileStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyDemo2 {
/**
 * 主方法，用于从文件中读取数据并输出
 * 使用FileInputStream读取文件内容，每次读取2个字节
 * @param args 命令行参数
 * @throws IOException 如果发生I/O错误
 */
    public static void main(String[] args) throws IOException {
    // 创建FileInputStream对象，用于读取文件"src\a.txt"
        FileInputStream fis=new FileInputStream(new File("src\\a.txt"));
    // 定义变量b用于记录每次读取的字节数
        int b=0;
    // 创建字节数组，作为每次读取数据的缓冲区，大小为2字节
        byte[] bytes=new byte[2];
    // 循环读取文件内容，直到文件末尾(返回-1)
        while ((b=fis.read(bytes))!=-1){
        // 输出每次读取的字节数
            System.out.println(b);
        // 将读取的字节数组转换为字符串并输出(0到b)
            System.out.println(new String(bytes,0,b));
        }
    }
}
