package StuDemo8_09;

import lombok.Data;

import java.util.Objects;

/*
     创建学生对象
     总分 按照从高到低排序
     总分一样-> 语文成绩排序
     语文一样-> 数学成绩排序
     数学一样-> 英语成绩排序
     英语一样-> 年龄排序
     年龄一样-> 姓名字母排序
     姓名字母排序一样-> 认为同一个不存
 */
@Data
public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;
    private double source;
    private double chinese;
    private double math;
    private double english;


    public Student1(double english, double math, double chinese, int age, String name, double source) {
        this.english = english;
        this.source = english+math+chinese;
        this.math = math;
        this.chinese = chinese;
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Double.compare(chinese, student1.chinese) == 0 && Double.compare(math, student1.math) == 0 && Double.compare(english, student1.english) == 0
                && Objects.equals(name, student1.name) && Objects.equals(source, student1.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chinese, math, english, source);
    }

    @Override
    public int compareTo(Student1 o) {
        double rs = (this.getSource() - o.getSource());

        rs = rs == 0 ? (this.getChinese() - o.getChinese()) : rs;

        rs = rs == 0 ? (this.getMath() - o.getMath()) : rs;

        rs = rs == 0 ? (this.getEnglish() - o.getEnglish()) : rs;

        rs=  rs == 0 ? o.getAge()-this.getAge():rs;

        rs=rs==0 ? o.getName().compareTo(this.getName()):rs;

        if(rs<0) return -1;
        else return 1;
    }

}
