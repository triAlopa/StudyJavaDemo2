package stuDemo9_06.myReflect3;

import java.lang.reflect.Field;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //获取字节码文件对象
        Class<?> clazz = Class.forName("stuDemo9_06.myReflect3.Student");

        //获取 公共的字段
//        Field[] fie1 = clazz.getFields();
//        for (Field f : fie1) {
//            System.out.println(f);
//        }//public java.lang.String stuDemo9_06.myReflect3.Student.gender

        //获取 所有字段
//        Field[] fil2 = clazz.getDeclaredFields();
//        for (Field f : fil2) {
//            System.out.println(f);
//        }
        //private java.lang.String stuDemo9_06.myReflect3.Student.name
        //private int stuDemo9_06.myReflect3.Student.age
        //public java.lang.String stuDemo9_06.myReflect3.Student.gender

        //获取指定的字段
        //对于不是公共权限的
        Field field = clazz.getDeclaredField("name");
        System.out.println(field);//private java.lang.String stuDemo9_06.myReflect3.Student.name

        //获取权限修饰
        int modifiers = field.getModifiers();
        System.out.println(modifiers);//2

        //获取数据类型
        Class<?> type = field.getType();
        System.out.println(type);//class java.lang.String

        //获取变量名
        String name = field.getName();
        System.out.println(name);//name

        //创建对象，获取对象里该字段的值
        //对于私有的 ，暴力获取和赋值
        Student s1=new Student("张三");
        field.setAccessible(true);
        String n = (String)field.get(s1);
        System.out.println(n);
        //赋值
        field.set(s1,"lisi");
        System.out.println(s1);
    }
}
