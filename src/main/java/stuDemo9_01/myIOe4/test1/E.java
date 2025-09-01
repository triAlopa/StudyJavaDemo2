package stuDemo9_01.myIOe4.test1;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//第三次必定为
public class E {
/**
 * 主方法：从文件中读取名字，随机选择一个写入临时文件，然后读取临时文件内容并输出结果
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
        // 创建BufferedReader对象，用于读取文件
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe4/test1/names.txt"));
        String str = null; // 存储读取的行数据
        ArrayList<String> list = new ArrayList<>(); // 创建ArrayList集合存储名字
        // 循环读取文件内容，直到文件末尾
        while ((str = br.readLine()) != null) {
            // 将每行按"-"分割，取第一部分（名字）添加到集合中
            list.add(str);
        }
        br.close();
    // 使用Collections.shuffle方法随机打乱集合中元素的顺序
        Collections.shuffle(list);
    // 获取打乱后的第一个元素（随机选中的名字）
        String string = list.get(0);
    // 创建BufferedWriter对象，用于向文件追加内容
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/stuDemo9_01/myIOe4/test1/nameTemp.txt",true));
    // 将随机选中的名字写入文件
        bw.write(string);
    // 写入一个换行符
        bw.newLine();
    // 关闭写入流
        bw.close();
    // 创建FileReader和BufferedReader对象，用于读取临时文件
        FileReader fr = new FileReader("src/main/java/stuDemo9_01/myIOe4/test1/nameTemp.txt");
        BufferedReader br1 = new BufferedReader(fr);
    // 初始化计数器，用于统计文件中的行数
        int count = 0;
    // 循环读取临时文件内容，统计行数
        while (br1.readLine() != null) {
            System.out.println(count);
            count++;
        }
    // 关闭读取流
        br1.close();
        if (count == 3) System.out.println("张三-男-23");
        else System.out.println(string);
    }
}
