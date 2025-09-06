package stuDemo9_06.E;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;

public class E1 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student s1 = new Student("张三", 23, 140.9, "睡觉");
        saveObject(s1);
        saveObject(new Teacher("李四",24));
    }

    public static void saveObject(Object s1) throws IOException, IllegalAccessException {
        Class clazz = s1.getClass();

        String clazzName = clazz.getName();
        System.out.println(clazzName);

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/stuDemo9_06/E/name.txt",true));

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            System.out.println(name + ": " + field.get(s1));
//            String[] split = field.toString().split(".");
//            System.out.println(split.length - 1);
            bw.write(name + ": " + field.get(s1));
            bw.newLine();
            bw.flush();
        }
    }
}
