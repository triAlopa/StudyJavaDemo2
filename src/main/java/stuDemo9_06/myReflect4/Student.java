package stuDemo9_06.myReflect4;

import java.io.IOException;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    protected Student(int age){
        this.age=age;
    }

    public Student(String name){
        this.name=name;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void sleep(){
        System.out.println("正在睡觉。。");
    }

/**
 * 吃东西的方法
 * @param something 要吃的东西，类型为String
 * @throws NullPointerException 当传入的something为null时可能抛出此异常
 * @throws IOException 当发生I/O错误时可能抛出此异常
 * @throws ClassCastException 当类型转换失败时可能抛出此异常
 * @return 返回一个字符串"饱了"，表示吃饱了的状态
 */
    private String eat(String something) throws NullPointerException, IOException,ClassCastException{
        System.out.println("正在吃"+something);  // 打印正在吃东西的信息
        return "饱了";  // 返回吃饱了的状态
    }

    private String eat(String something,int a) {
        System.out.println("正在吃"+something);

        return "饱了";
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
