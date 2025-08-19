package stuDemo8_19.myFile;

import java.io.File;

public class fileDemo1 {
/**
 * Java程序主方法入口
 * @param args 命令行参数
 */
    public static void main(String[] args) {

    // 创建File对象f1，指定文件完整路径
        File f1=new File("C:\\Users\\Chen\\Desktop\\a.txt");
    // 输出File对象f1的路径信息
        System.out.println(f1);

    // 创建File对象f2，通过父路径和子文件名构造
        File f2=new File("C:\\Users\\Chen\\Desktop","a.txt");

    // 输出File对象f2的路径信息
        System.out.println(f2);

    // 创建File对象parent，表示父目录
        File parent=new File("C:\\Users\\Chen\\Desktop");
    // 创建File对象f4，通过parent目录和文件名构造
        File f4=new File(parent,"a.txt");
    }
}
