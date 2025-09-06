package stuDemo9_06.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class E2 {
/**
 * 主方法，用于通过反射机制调用指定类中的指定方法
 * 通过读取配置文件获取类名和方法名，然后动态加载类并调用方法
 *
 * @param args 命令行参数
 * @throws IOException 如果读取配置文件时发生I/O错误
 * @throws ClassNotFoundException 如果找不到指定的类
 * @throws NoSuchMethodException 如果找不到指定的方法
 * @throws InvocationTargetException 如果方法调用抛出异常
 * @throws IllegalAccessException 如果没有权限访问指定方法
 */
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    // 创建Properties对象，用于读取属性文件
        Properties pro=new Properties();
    // 创建文件输入流，读取配置文件
        FileInputStream fis=new FileInputStream("src/main/java/stuDemo9_06/E/pro.properties");

    // 从输入流中加载属性列表
        pro.load(fis);

    // 从配置文件中获取类名和方法名
        String className = (String)pro.get("class");
        String method = (String)pro.get("method");

    // 使用类名加载类
        Class clazz = Class.forName(className);

    // 获取类中声明的方法
        Method m = clazz.getDeclaredMethod(method);
    // 设置可访问，即使方法是私制的也可以访问
        m.setAccessible(true);
    // 创建Student类的实例
        Student s=new Student();
    // 调用方法
        m.invoke(s);
    }
}
