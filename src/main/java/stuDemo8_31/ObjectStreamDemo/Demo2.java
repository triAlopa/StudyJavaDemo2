package stuDemo8_31.ObjectStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/g.txt"));
        Student o = (Student)ois.readObject();
        System.out.println(o);

        ois.close();
    }
}
