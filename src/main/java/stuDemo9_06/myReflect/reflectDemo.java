package stuDemo9_06.myReflect;

public class reflectDemo {
/**
 * 主方法，演示Java中获取Class对象的三种方式
 * @param args 命令行参数
 * @throws ClassNotFoundException 当类找不到时抛出异常
 */
    public static void main(String[] args) throws ClassNotFoundException {

    // 第一种方式：使用Class类的forName()方法，通过类全名获取Class对象
        Class clazz = Class.forName("stuDemo9_06.myReflect.Student");

    // 第二种方式：使用.class属性，通过类直接获取Class对象
        Class clazz2 = Student.class;

    // 创建一个Student类的实例对象
        Student s1=new Student();

    // 第三种方式：使用对象的getClass()方法，通过实例对象获取Class对象
        Class clazz3 = s1.getClass();


    // 比较第一种和第二种方式获取的Class对象是否为同一个
        System.out.println(clazz==clazz2);
    // 比较第一种和第三种方式获取的Class对象是否为同一个
        System.out.println(clazz==clazz3);


    }
}
