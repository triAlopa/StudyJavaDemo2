package stuDemo9_06Anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testDemo {
/**
 * 主方法，用于演示自定义注解@myTest的使用
 * 通过反射机制查找并执行带有@myTest注解的方法
 *
 * @param args 命令行参数
 * @throws InvocationTargetException 当调用的方法抛出异常时抛出
 * @throws IllegalAccessException 当访问被拒绝时抛出
 * @throws ClassNotFoundException 当类找不到时抛出
 */
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {
    // 通过类名获取Class对象
        Class<?> clazz = Class.forName("stuDemo9_06Anno.MyTestMethod");


    // 获取类中声明的所有方法
        Method[] methods = clazz.getDeclaredMethods();

    // 创建MyTestClass的实例
        MyTestMethod test = new MyTestMethod();
    // 遍历所有方法
        for (Method method : methods) {
        // 检查方法上是否存在@myTest注解
            if(method.isAnnotationPresent(myTest.class)){
            // 如果存在注解，则调用该方法
                method.invoke(test);
            }
        }
    }
}
