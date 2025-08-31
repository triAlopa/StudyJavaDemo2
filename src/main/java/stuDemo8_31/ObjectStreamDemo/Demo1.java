package stuDemo8_31.ObjectStreamDemo;

import stuDemo8_18.MyMethod.E.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/g.txt"));
        Student s=new Student("zhangsan",23);
        oos.writeObject(s);
        oos.close();
    }
}
