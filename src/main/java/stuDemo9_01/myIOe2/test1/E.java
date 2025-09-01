package stuDemo9_01.myIOe2.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class E {
/**
 * 主方法，用于从文件中读取数据并随机输出一个名字
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */

    //name-sex-age
    public static void main(String[] args) throws IOException {
    // 创建BufferedReader对象，用于读取文件
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe2/test1/names.txt"));
        String str = null; // 存储读取的行数据
        ArrayList<String> list = new ArrayList<>(); // 创建ArrayList集合存储名字
    // 循环读取文件内容，直到文件末尾
        while ((str = br.readLine()) != null) {
        // 将每行按"-"分割，取第一部分（名字）添加到集合中
            list.add(str.split("-")[0]);
        }
    // 使用Collections.shuffle方法随机打乱集合中元素的顺序
        Collections.shuffle(list);
    // 输出集合中第一个元素（即随机选中的名字）
        System.out.println(list.get(0));
    }
}
