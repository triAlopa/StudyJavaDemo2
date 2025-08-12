package StuDemo8_09;

import java.util.TreeSet;

public class treeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet=new TreeSet<>();
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        Student s4=new Student("lis",24);
        Student s6=new Student("zhangsang",23);
        studentTreeSet.add(s1);
        studentTreeSet.add(s2);
        studentTreeSet.add(s3);
        studentTreeSet.add(s4);
        studentTreeSet.add(s6);
        System.out.println(studentTreeSet);
    }
}
