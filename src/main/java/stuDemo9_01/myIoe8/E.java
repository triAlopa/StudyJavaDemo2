package stuDemo9_01.myIoe8;

import java.io.*;
import java.util.Properties;

public class E {
/**
 * 主方法，用于演示Properties类的使用
 * 通过Properties类读取properties文件内容
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建Properties对象，用于存储键值对属性
        Properties p=new Properties();
    // 以下是被注释的代码，用于向Properties对象中添加数据并保存到文件
//        p.put("aaa","bbb");
//        p.put("ccc","bbba");
//        p.put("ddd","bbag");
//        p.put("ffff","bb");

    // 以下是被注释的代码，用于将Properties对象中的数据保存到文件
//        FileOutputStream fos=new FileOutputStream("src/main/java/stuDemo9_01/myIoe8/test.properties");
//        p.store(fos,"test");
//        fos.close();

    // 创建FileInputStream对象，用于读取properties文件
        FileInputStream fis=new FileInputStream("src/main/java/stuDemo9_01/myIoe8/test.properties");
    // 从输入流中加载properties文件内容到Properties对象
        p.load(fis);
    // 关闭输入流
        fis.close();
    // 打印Properties对象中的所有键值对
        System.out.println(p);
    }
}
