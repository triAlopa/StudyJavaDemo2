package StuDemo8_13map.E1;

import lombok.Data;

import java.util.Objects;

@Data
public class Student {
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
}
