package stuDemo9_01.myIOe5.test1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SimpleTimeZone;

public class E {
/**
 * 主方法，用于实现随机点名功能
 * 从两个文件中读取学生名单，并进行随机点名
 * @param args 命令行参数
 * @throws IOException 可能抛出的IO异常
 */
    public static void main(String[] args) throws IOException {
        // 创建BufferedReader对象，用于读取文件
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe5/test1/names.txt"));
        String str = null; // 存储读取的行数据
        ArrayList<String> list = new ArrayList<>(); // 创建ArrayList集合存储名字
        // 循环读取文件内容，直到文件末尾
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        br.close();
        // 创建临时列表，用于存储已点名的学生
        ArrayList<String> tempList = new ArrayList<>();
        // 读取已点名学生列表文件
        BufferedReader br1 = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe5/test1/nameList.txt"));
        String s = null;
        // 循环读取已点名学生列表文件内容，直到文件末尾
        while ((s = br1.readLine()) != null) {
            // 将每行按"-"分割，取第一部分（名字）添加到集合中
            tempList.add(s);
        }
        br1.close();
        // 检查是否所有学生都已点名
        if(tempList.size()==list.size()){
            System.out.println("一轮点名结束");
            tempList.clear();
            FileWriter fw=new FileWriter("src/main/java/stuDemo9_01/myIOe5/test1/nameList.txt"); // 清空已点名列表
            // 创建FileWriter对象，用于写入文件
            fw.close();
        } // 关闭文件写入器
        if (tempList.size() != list.size()) {
        // 如果还有未点名的学生
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/stuDemo9_01/myIOe5/test1/nameList.txt", true));
            // 创建BufferedWriter对象，用于追加写入文件
            while (true) {
            // 开始随机点名
                Collections.shuffle(list);
                String string = list.get(0); // 打乱学生列表顺序
                if (!tempList.contains(string)) { // 获取第一个学生（随机）
                // 如果该学生还未被点名
                    tempList.add(string);
                    System.out.println(string); // 添加到已点名列表
                    bw.write(string); // 输出被点名的学生
                    bw.newLine(); // 写入文件
                    break; // 换行
                } // 退出循环
            }
            bw.close();
        } // 关闭文件写入器


//        showStuInfo(list);
    } // 注释掉的显示学生信息方法

//    private static void showStuInfo(ArrayList<String> list) {
//        Collections.shuffle(list);
//        //ArrayList<String> arrayList = new ArrayList<>();
////        for (int i = 0; i < 20; i++) {
////            if (!arrayList.contains(list.get(i))) {
////                arrayList.add(list.get(i));
////            }
////        }
//        ArrayList<String> tempList=new ArrayList<>();
//        while (!list.isEmpty()){
//            String remove = list.remove(0);
//            System.out.println(remove);
//            tempList.add(remove);
//        }
//    }
}
