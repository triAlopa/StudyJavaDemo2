package stuDemo8_18.MyMethod;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class myMethodDemo3 {
    public static void main(String[] args) {
        /*
        方法引用（引用成员方法）
        格式
                其他类：其他类对象::方法名
                本类：this::方法名(引用处不能是静态方法)
                父类：super::方法名(引用处不能是静态方法)
        需求：
            集合中有一些名字，按照要求过滤数据
            数据："张无忌","周芷若","赵敏","张强","张三丰"
            要求：只要以张开头，而且名字是3个字的

       */
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        // 使用Lambda表达式过滤：以"张"开头且长度为3的字符串
        list.stream()
                .filter(s -> s.startsWith("张"))  // 过滤出以"张"开头的字符串
                .filter(s -> s.length() == 3)     // 过滤出长度为3的字符串
                .forEach(s -> System.out.println(s)); // 打印符合条件的字符串

        System.out.println("--------------------");

        // 使用方法引用过滤：通过StringJudge类中的stringJudge方法过滤
        list.stream().filter(new StringJudge()::stringJudge)
                .forEach(s -> System.out.println(s)); // 打印符合条件的字符串

        System.out.println("---------------------");

        // 使用方法引用过滤：通过myMethodDemo3类中的stringJudge方法过滤
        list.stream().filter(new myMethodDemo3()::stringJudge)
                .forEach(s -> System.out.println(s)); // 打印符合条件的字符串

    }
    public boolean stringJudge(String s){
        // 检查字符串是否以"张"开头且长度是否为3
        return s.startsWith("张") && s.length() == 3;
    }

}
