package stuDemo8_21.E;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;

public class E3 {
/**
 * 该程序用于读取文本文件中的数字数据，进行排序后重新写回文件
 * 程序从文件中读取以"-"分隔的数字字符串，将其转换为整数列表
 * 对整数列表进行排序后，再以"-"分隔的形式写回原文件
 */
    public static void main(String[] args) throws IOException {
        //文本文件中有以下的数据： 2-1-9-4-7-8 将文件中的数据进行排序，变成以下的数据： 1-2-4-7-8-9
        // 创建文件读取器，读取指定路径的文件
        FileReader fr = new FileReader("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\a.txt");
        // 使用StringBuilder来高效地构建字符串
        StringBuilder sb = new StringBuilder();
        int a = 0;
        // 循环读取文件中的每个字符，直到文件末尾
        while ((a = fr.read()) != -1) {
            sb.append((char) a);
        }
        // 关闭文件读取器
        fr.close();
        // 将读取到的字符串按"-"分割成字符串数组
        String[] split = sb.toString().split("-");
        // 创建Integer类型的ArrayList来存储数字
        ArrayList<Integer> integers = new ArrayList<>();
        // 遍历字符串数组，将每个字符串转换为整数并添加到列表中
        for (String s : split) {
            integers.add(Integer.parseInt(s));
        }

        // 使用Collections工具类对整数列表进行排序
        Collections.sort(integers);
        // 打印排序后的结果
        System.out.println(integers);
        // 创建文件写入器，用于将排序后的数据写回文件
        FileWriter fw=new FileWriter("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\a.txt");
        // 遍历排序后的整数列表
        for (int i = 0; i < integers.size(); i++) {
            // 将整数转换为字符串并写入文件
            fw.write(integers.get(i)+"");
            // 如果不是最后一个元素，则写入"-"分隔符
            if(i!=integers.size()-1){
             fw.write("-");
            }
        }
        // 关闭文件写入器
        fw.close();
    }
}
