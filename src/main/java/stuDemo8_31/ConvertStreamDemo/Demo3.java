package stuDemo8_31.ConvertStreamDemo;

import java.io.*;
import java.nio.charset.Charset;

public class Demo3 {
/**
 * 主方法，用于演示字符流文件的读写操作
 * 目前代码被注释，展示了如何使用InputStreamReader和OutputStreamWriter
 * 进行不同字符编码（GBK到UTF-8）的转换
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 以下代码被注释，展示了如何使用GBK编码读取文件并转换为UTF-8编码写入
    // 创建InputStreamReader，使用GBK编码读取src/e.txt文件
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("src/e.txt"), Charset.forName("GBk"));
    // 创建OutputStreamWriter，使用UTF-8编码写入到src/f.txt文件
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src/f.txt"),Charset.forName("UTF-8"));
// 定义整型变量a用于存储读取的字符
//        int a=0;
    // 循环读取文件内容，直到文件末尾（返回-1）
//        while ((a=isr.read())!=-1){
//            osw.write(a); // 将读取的字符写入目标文件
//        }
    // 关闭输出流和输入流，释放资源
//        osw.close();
//        isr.close();

        FileReader fr=new FileReader("src/e.txt",Charset.forName("GBK"));
        FileWriter fw=new FileWriter("src/f.txt",Charset.forName("UTF-8"));

        int a=0;
        while ((a=fr.read())!=-1){
            fw.write(a); // 将读取的字符写入目标文件
        }
        fw.close();
        fr.close();
    }
}
