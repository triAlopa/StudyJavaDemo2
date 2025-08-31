package stuDemo8_31.E;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 序列化多个对象的示例类
 * 该类演示了如何将多个Student对象序列化到文件中
 */
public class E5 {
    //序列化多个对象
    public static void main(String[] args) throws IOException {
        Student s1=new Student("zhangsan",23,"武汉");
        Student s2=new Student("lisi",24,"南京");
        Student s3=new Student("wangwu",25,"上海");

        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s3);
        list.add(s2);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/r.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
