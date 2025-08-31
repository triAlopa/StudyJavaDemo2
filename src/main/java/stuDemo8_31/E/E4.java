package stuDemo8_31.E;

import java.io.*;

public class E4 {
/**
 * 主方法，用于检查userConfig.txt文件内容长度并输出相应提示信息
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建BufferedWriter对象，以追加模式打开文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/userConfig.txt",true));

    // 向文件中写入一个值为1的字符
        bw.write((char)1);
    // 关闭BufferedWriter
        bw.close();

    // 创建BufferedReader对象读取文件
        BufferedReader br=new BufferedReader(new FileReader("src/userConfig.txt"));
    // 初始化文件长度计数器
        int fl=0;

        int a=0;
    // 读取文件内容，直到文件末尾
        while ((a= br.read())!=-1){
        // 每读取一个字符，计数器加1
            fl++;
        }

    // 关闭BufferedReader
        br.close();

    // 判断文件长度是否小于等于3
        if(fl<=3){
        // 如果小于等于3，输出继续使用的信息
            System.out.println("继续使用 "+fl);
        }else System.err.println("还想白嫖?");

    }
}
