package StuDemo8_13map.treeDemo;

import lombok.Data;

import java.util.Objects;

@Data
public class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object  o){
        Student student =(Student) o;
        return student.getName().equals(this.name)&&student.getAge()==this.getAge();
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student) o;
        int rs=this.getAge()-student.getAge();

        rs=rs==0?((Student) o).getName().compareTo(this.getName()):rs;
        return rs;
    }
}
