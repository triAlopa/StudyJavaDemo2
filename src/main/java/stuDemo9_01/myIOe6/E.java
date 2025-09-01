package stuDemo9_01.myIOe6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class E {
/**
 * 主方法，用于读取学生数据，计算权重，随机选择学生并更新权重，最后将结果写入文件
 * @param args 命令行参数
 * @throws IOException 可能抛出的IO异常
 */
    public static void main(String[] args) throws IOException {

        //添加学生到列表
    // 使用BufferedReader读取文件内容
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe6/names.txt"));
        String line = null;
    // 创建ArrayList存储学生对象
        ArrayList<Student> list = new ArrayList<>();
    // 逐行读取文件内容
        while ((line = br.readLine()) != null) {
        // 将每行数据分割并创建Student对象
            Student stu = new Student(line.split("-")[0], line.split("-")[1], Integer.parseInt(line.split("-")[2]), Double.parseDouble(line.split("-")[3]));
        // 将学生对象添加到列表中
            list.add(stu);
        }
    // 关闭读取流
        br.close();
        //计算总权重
        double weight = 0;
    // 遍历学生列表，累加权重
        for (Student stu : list) {
            weight = weight + stu.getWeight();
        }

    // 创建数组存储每个学生的权重占比
        double[] arr = new double[list.size()];
        int index = 0;
    // 计算每个学生的权重占比并存储到数组中
        for (Student stu : list) {
            double w = stu.getWeight() / weight;
            arr[index] = w;
            index++;
        }

    // 计算权重数组的累加和
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

    // 生成随机数
        double random = Math.random();
        // 二分查找 找到的为原索引的负数 -1
        //所以 取反 再减1 得到要求范围内索引
        int result = -Arrays.binarySearch(arr, random) - 1;
//        System.out.println(random);
//        System.out.println(i);
//
//        System.out.println(Arrays.toString(arr));
        Student s = list.get(result);
        System.out.println(s.toString());
        // 将选中学生的权重减半
        double w = s.getWeight() / 2;
        s.setWeight(w);
//        list.set(result, s);
        // 使用BufferedWriter将更新后的学生数据写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/stuDemo9_01/myIOe6/names.txt"));
        // 遍历学生列表，将每个学生信息写入文件
        for (Student stu : list) {
            bw.write(stu.toString());
            bw.newLine();
        }
        // 关闭写入流
        bw.close();
    }
}
