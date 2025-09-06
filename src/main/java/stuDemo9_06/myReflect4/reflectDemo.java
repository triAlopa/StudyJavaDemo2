package stuDemo9_06.myReflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> clazz = Class.forName("stuDemo9_06.myReflect4.Student");

        //获取公共的成员方法 ，包括继承父类的方法
//        Method[] ms1 = clazz.getMethods();
//        for (Method m : ms1) {
//            System.out.println(m);
//        }
        //public void stuDemo9_06.myReflect4.Student.setAge(int)
        //public int stuDemo9_06.myReflect4.Student.getAge()
        //public java.lang.String stuDemo9_06.myReflect4.Student.getName()
        //public java.lang.String stuDemo9_06.myReflect4.Student.toString()
        //public void stuDemo9_06.myReflect4.Student.sleep()
        //public void stuDemo9_06.myReflect4.Student.setName(java.lang.String)
        //public boolean java.lang.Object.equals(java.lang.Object)
        //public native int java.lang.Object.hashCode()
        //public final native java.lang.Class java.lang.Object.getClass()
        //public final native void java.lang.Object.notify()
        //public final native void java.lang.Object.notifyAll()
        //public final void java.lang.Object.wait(long) throws java.lang.InterruptedException
        //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        //public final void java.lang.Object.wait() throws java.lang.InterruptedException

        //获取该类的所有成员方法 ，但是不会包含继承父类的方法
//        Method[] ms2 = clazz.getDeclaredMethods();
//        for (Method method : ms2) {
//            System.out.println(method);
//        }
        //public int stuDemo9_06.myReflect4.Student.getAge()
        //private void stuDemo9_06.myReflect4.Student.eat(java.lang.String) throws java.lang.NullPointerException,java.io.IOException,java.lang.ClassCastException
        //public void stuDemo9_06.myReflect4.Student.setAge(int)
        //public java.lang.String stuDemo9_06.myReflect4.Student.getName()
        //public java.lang.String stuDemo9_06.myReflect4.Student.toString()
        //public void stuDemo9_06.myReflect4.Student.sleep()
        //public void stuDemo9_06.myReflect4.Student.setName(java.lang.String)

        //获取该类的指定成员方法，预防方法的重载，要指定形参
        //参数1:方法名 参数2 ：方法形参
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(eat);
        //获取方法名
        String name = eat.getName();
        System.out.println(name);//eat
        //获取方法权限
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);//2
        //获取方法形参
        Class<?>[] parameterTypes = eat.getParameterTypes();
        for (Class<?> p : parameterTypes) {
            System.out.println(p);
        }//class java.lang.String

        //返回值
        Class<?> returnType = eat.getReturnType();
        System.out.println(returnType);//class java.lang.String

        //获取抛出的异常
        Class<?>[] exceptionTypes = eat.getExceptionTypes();
        for (Class<?> e : exceptionTypes) {
            System.out.println(e);
        }
        //class java.lang.NullPointerException
        //class java.io.IOException
        //class java.lang.ClassCastException

        //指定对象执行该方法，并返回结果
        eat.setAccessible(true);
        Student s1=new Student("张三");
        String s = (String)eat.invoke(s1, "lu");//正在吃lu

        System.out.println(s);//饱了
    }
}
