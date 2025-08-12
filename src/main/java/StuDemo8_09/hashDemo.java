package StuDemo8_09;

import java.util.Collection;
import java.util.HashSet;

public class hashDemo {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("lisi", 24);
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        System.out.println(studentHashSet.add(s3));


    }
}
