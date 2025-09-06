package stuDemo9_06.E;

public class Student {
    private String name;
    private int age;
    private double height;
    private String hobby;

    public Student() {
    }

    public Student(String name, int age, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    private void study(){
        System.out.println("学生在学习");
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
