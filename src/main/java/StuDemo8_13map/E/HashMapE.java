package StuDemo8_13map.E;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapE {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        Student s1 = new Student("zhangsan", 23);
        Student s5 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        hashMap.put(s1,"皖");
        hashMap.put(s2,"京");
        hashMap.put(s3,"豫");
        hashMap.put(s5,"豫");
        Set<Map.Entry<Student, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entrySet) {
            System.out.println("student  "+entry.getKey());
            System.out.println("adreses "+entry.getValue());
        }
    }
}
