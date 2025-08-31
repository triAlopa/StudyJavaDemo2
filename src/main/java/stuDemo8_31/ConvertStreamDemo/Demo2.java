package stuDemo8_31.ConvertStreamDemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Demo2 {
/**
 * 主方法，演示使用FileWriter写入GBK编码的文本文件
 * @param args 命令行参数
 * @throws IOException 可能抛出的IO异常
 */
    public static void main(String[] args) throws IOException {
    // 使用OutputStreamWriter和FileOutputStream写入GBK编码文件的代码被注释掉了
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("src/e.txt"), Charset.forName("GBK"));
//
//        osw.write("测试测试");
//
//        osw.close();

    // 创建FileWriter对象，指定文件路径和字符编码为GBK
        FileWriter fw=new FileWriter("src/e.txt",Charset.forName("GBK"));

    // 向文件写入内容"JAVA炒饭"
        fw.write("JAVA炒饭");

    // 关闭FileWriter，释放资源
        fw.close();
    }
}
