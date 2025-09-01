package stuDemo9_01.myIOe3.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


//加入 男生被抽到概率为70%
public class E {
/**
 * 主方法，用于读取文件内容并进行随机抽取统计
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
        // 创建BufferedReader对象，用于读取文件
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe2/test1/names.txt"));
        String str = null; // 存储读取的行数据
        ArrayList<String> list = new ArrayList<>(); // 创建ArrayList集合存储名字
        // 循环读取文件内容，直到文件末尾
        while ((str = br.readLine()) != null) {
            // 将每行按"-"分割，取第一部分（名字）添加到集合中
            list.add(str);
        }
        int boyCount=0; // 男生计数器
        int girlCount=0; // 女生计数器

    // 循环10000次，进行随机抽取和统计
        for (int i = 0; i < 10000; i++) {
        // 获取随机学生信息列表
            ArrayList<String> arrayList = getStudentsInfo(list);
        // 打乱集合顺序，实现随机抽取
            Collections.shuffle(arrayList);
        // 获取第一个学生信息
            String string=arrayList.get(0);

        // 判断学生性别，并更新对应计数器
            if("男".equals(string.split("-")[1])) boyCount++;
            if("女".equals(string.split("-")[1])) girlCount++;
            System.out.println(string); // 输出当前抽取的学生信息
        }

    // 输出统计结果
        System.out.println("boyCount "+boyCount);
        System.out.println("girlCount "+girlCount);
    }

/**
 * 从学生列表中随机选取指定数量的男女生信息
 * @param list 包含学生信息的列表，每个学生信息格式为"姓名-性别"
 * @return 包含随机选取的7名男生和3名女生信息的ArrayList
 */
    private static ArrayList<String> getStudentsInfo(ArrayList<String> list) {
    // 打乱原始列表顺序，确保随机性
        Collections.shuffle(list);
    // 创建HashSet存储男生信息
        HashSet<String> boyHs = new HashSet<>();

    // 遍历列表，选取7名男生
        for (String str : list) {
        // 当选够7名男生时退出循环
            if(boyHs.size()==7) break;
        // 检查是否为男生，如果是则添加到集合中
            if("男".equals(str.split("-")[1])) boyHs.add(str);
        }

    // 再次打乱列表顺序，确保女生选取的随机性
        Collections.shuffle(list);
    // 创建HashSet存储女生信息
        HashSet<String> girlHs=new HashSet<>();
    // 遍历列表，选取3名女生
        for (String str : list) {
        // 当选够3名女生时退出循环
            if(girlHs.size()==3) break;
        // 检查是否为女生，如果是则添加到集合中
            if("女".equals(str.split("-")[1])) girlHs.add(str);
        }

    // 创建结果列表，合并男生和女生信息
        ArrayList<String> arrayList=new ArrayList<>();
    // 添加所有男生信息
        arrayList.addAll(boyHs);
    // 添加所有女生信息
        arrayList.addAll(girlHs);


    // 返回最终结果
        return arrayList;
    }
}
