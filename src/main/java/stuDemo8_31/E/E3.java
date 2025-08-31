package stuDemo8_31.E;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class E3 {
/**
 * 主方法，用于读取文件内容，按首字符数字排序后写入新文件
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
        // 使用BufferedReader读取文件
        BufferedReader br=new BufferedReader(new FileReader("src/csb.txt"));

        // 用于存储读取的行
        String str=null;

        // 创建ArrayList存储文件内容
        ArrayList<String> list=new ArrayList<>();

        // 循环读取文件内容，直到文件末尾
        while ((str=br.readLine())!=null){
            list.add(str);
        }
        // 关闭读取流
        br.close();
//        System.out.println(list);

        // 使用自定义比较器对列表进行排序，比较规则为每行的首字符数字大小
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 获取两个字符串的首字符并转换为字符串
                String s1 = o1.charAt(0)+"";
                String s2 = o2.charAt(0)+"";
                // 将首字符转换为整数进行比较
                int i1=Integer.parseInt(s1);
                int i2=Integer.parseInt(s2);
                // 返回比较结果
                return i1-i2;
            }
        });

        // 使用BufferedWriter写入文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/csb3.txt"));

        for (int i = 0; i < list.size(); i++) {
        // 遍历排序后的列表，逐行写入新文件
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
        // 关闭写入流
    }
}
