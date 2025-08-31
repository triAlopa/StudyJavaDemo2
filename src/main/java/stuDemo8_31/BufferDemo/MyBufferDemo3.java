package stuDemo8_31.BufferDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferDemo3 {
/**
 * 主方法，用于从文件中读取内容并输出
 * @param args 命令行参数
 * @throws IOException 如果发生I/O错误
 */
    public static void main(String[] args) throws IOException {
    // 创建BufferedReader对象用于读取文件
        BufferedReader br=new BufferedReader(new FileReader("src/a.txt"));
    // 读取文件第一行内容并输出
        String string = br.readLine();
        System.out.println(string);

    // 读取文件第二行内容并输出
        String string1 = br.readLine();
        System.out.println(string1);

    // 关闭BufferedReader，释放资源
        br.close();
    }
}
