package stuDemo8_31.E;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class E6 {
/**
 * 反序列化读取数据的示例程序
 * 该程序从文件中读取序列化的学生对象列表，并打印到控制台
 */
    //反序列化 读取数据
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    // 创建ObjectInputStream对象，用于从文件读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/r.txt"));

    // 从文件中读取ArrayList对象，并强制转换为Student类型列表
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
    // 关闭ObjectInputStream，释放资源
        ois.close();
    // 遍历学生列表，打印每个学生对象的信息
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
