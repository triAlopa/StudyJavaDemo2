package StuDemo8_07.Collection.Demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEqualsDemo {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu", 25);
        Collection<Student> collection=new ArrayList<>();
        collection.add(s1);
        collection.add(s3);
        collection.add(s2);
        Student s4=new Student("wangwu", 25);
        //未进行重写容器泛型 的校验是否存在
        System.out.println(collection.contains(s4));//false
        //重写了equals方法
        System.out.println(collection.contains(s4));//true
    }
}
