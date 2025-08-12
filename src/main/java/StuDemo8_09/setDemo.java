package StuDemo8_09;

import java.util.HashSet;
import java.util.Set;


public class setDemo {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个HashSet集合对象，用于存储字符串
        Set<String> set=new HashSet();
    // 向集合中添加元素
        set.add("hello");
        set.add("java，");
        set.add("hello，");
        set.add("world; ");

    // 使用迭代器遍历集合的代码被注释掉了
//        Iterator it = set.iterator();
//        while (it.hasNext()){
//            String s=(String) it.next();
//            System.out.println(s);
//        }
//
    // 使用for-each循环遍历集合的代码被注释掉了
//        for (Object o : set) {
//            System.out.println(o.toString());
//        }
    // 使用Java 8的forEach方法和Lambda表达式遍历并打印集合中的元素
        set.forEach((string )-> System.out.println(string));
    }
}
