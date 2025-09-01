package StuDemo8_09;



import java.util.Objects;


public class Student  implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    //  private double chinese;
    //    private double math;
    //    private double english;

    @Override
    public int compareTo(Student o) {
        int rs = this.getAge() - o.getAge();

        rs=rs==0?this.getName().compareTo(o.getName()):rs;

        return 0;
    }
}
