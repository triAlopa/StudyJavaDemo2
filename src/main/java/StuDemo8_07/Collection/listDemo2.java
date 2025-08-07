package StuDemo8_07.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
1. 迭代器
2. 列表迭代器
3. 增强for
4. Lambda表达式
5. 普通for循环
 */
public class listDemo2 {
    public static void main(String[] args) {
        // 创建一个字符串列表
        List<String> stringList = new ArrayList<>();
        // 向列表中添加元素
        stringList.add("hello");
        stringList.add("nt");
        stringList.add("java");
        //  1. 迭代器
        // 创建一个迭代器
        Iterator<String> iterator = stringList.iterator();
        // 使用迭代器遍历列表
        while (iterator.hasNext()){
            // 获取下一个元素
            String s = iterator.next();
            // 打印元素
            System.out.print(s+" ");
        }
        System.out.println();
        //2. 列表迭代器
        // 创建一个列表迭代器
        ListIterator<String> lit = stringList.listIterator();
        // 使用列表迭代器遍历列表
        while (lit.hasNext()){
            // 在当前位置添加元素
            lit.add("aaa");
            // 获取下一个元素
            String s = lit.next();
            // 打印元素
            System.out.print(s+" ");
        }
        System.out.println();
        // 打印列表
        System.out.println(stringList);
        // 使用列表迭代器反向遍历列表
        while (lit.hasPrevious()){
            // 获取上一个元素
            String s = lit.previous();
            // 打印元素
            System.out.println(s);
        }
        System.out.println();
        //3. 增强for
        // 使用增强for循环遍历列表
        for (String s : stringList) {
            // 打印元素
            System.out.print(s+" ");
        }
        System.out.println();
        //4. Lambda表达式
        // 使用Lambda表达式遍历列表
        stringList.forEach(s-> System.out.print(s+" "));
        System.out.println();
        //5. 普通for循环
        // 使用普通for循环遍历列表
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i)+" ");
        }
    }
}
