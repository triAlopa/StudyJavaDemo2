package stuDemo8_31.print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class printDemo {
/**
 * 主方法，用于演示使用PrintStream向文件写入数据
 * @param args 命令行参数
 * @throws FileNotFoundException 如果文件无法创建或打开时抛出此异常
 */
    public static void main(String[] args) throws FileNotFoundException {
    // 创建PrintStream对象，指向a.txt文件，使用UTF-8编码，并启用自动刷新
        PrintStream ps=new PrintStream(new FileOutputStream("src/a.txt"),true, Charset.forName("UTF-8"));
    // 向文件写入整数97，并自动添加换行符
        ps.println(97);
    // 向文件写入整数111，不添加换行符
        ps.print(111);
    // 向文件写入一个换行符
        ps.printf(" \n");
    // 再次向文件写入整数97，并自动添加换行符
        ps.println(97);
    }
}
