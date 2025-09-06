package stuDemo9_06.myReflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //获取字节码对象
        Class clazz = Class.forName("stuDemo9_06.myReflect2.Student");

        //获取公共的构造方法
//        Constructor[] cons1 = clazz.getConstructors();
//        for (Constructor con : cons1) {
//            System.out.println(con);
//        }
        //public stuDemo9_06.myReflect2.Student()
        //public stuDemo9_06.myReflect2.Student(java.lang.String)

        //获取全部 构造方法
//        Constructor[] cons2 = clazz.getDeclaredConstructors();
//        for (Constructor con : cons2) {
//            System.out.println(con);
//        }
        //public stuDemo9_06.myReflect2.Student()
        //protected stuDemo9_06.myReflect2.Student(int)
        //public stuDemo9_06.myReflect2.Student(java.lang.String)
        //private stuDemo9_06.myReflect2.Student(java.lang.String,int)

        //获取公共的指定的构造方法
//        Constructor con1 = clazz.getConstructor();
//        System.out.println(con1);
        //public stuDemo9_06.myReflect2.Student()

        //获取无论什么权限的构造方法
        Constructor con2 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2);//private stuDemo9_06.myReflect2.Student(java.lang.String,int)

        //获取权限修饰
        int modifiers = con2.getModifiers();
        System.out.println(modifiers);//2

        //获取构造方法 形参
        Parameter[] parameters = con2.getParameters();
        for (Parameter p : parameters) {
            System.out.println(p);
        }
        //java.lang.String arg0
        //int arg1

        //利用方法创建对象 newInstance(参数与之对应)
        //class stuDemo9_06.myReflect2.reflectDemo cannot access a member of class stuDemo9_06.myReflect2.Student with modifiers "private"
        //对于私有的，可以暴力创建对象
        con2.setAccessible(true);
        Student stu =(Student) con2.newInstance("张三", 23);
        System.out.println(stu);
    }
}
