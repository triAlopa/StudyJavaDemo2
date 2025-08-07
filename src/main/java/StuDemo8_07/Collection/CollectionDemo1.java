package StuDemo8_07.Collection;


import java.util.ArrayList;
import java.util.Collection;

/*
Collection
  | 方法名                     | 说明                               |
  | :------------------------- | :--------------------------------- |
  | boolean add(E e)           | 添加元素                           |
  | boolean remove(Object o)   | 从集合中移除指定的元素             |
  | boolean removeIf(Object o) | 根据条件进行移除                   |
  | void   clear()             | 清空集合中的元素                   |
  | boolean contains(Object o) | 判断集合中是否存在指定的元素       |
  | boolean isEmpty()          | 判断集合是否为空                   |
  | int   size()               | 集合的长度，也就是集合中元素的个数 |
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        // 创建一个Collection集合
        Collection<String> c= new ArrayList<>();
        // 向集合中添加元素
        c.add("hello, ");
        c.add("java!");
        // 输出集合的长度
        System.out.println(c.size());
        // 输出集合的内容
        System.out.println(c.toString());

        // 从集合中移除指定的元素
        c.remove("hello, ");
        // 输出集合的内容
        System.out.println(c.toString());

        // 清空集合中的元素
        c.clear();
        // 输出集合的内容
        System.out.println(c.toString()+"1 ");

        // 向集合中添加元素
        c.add("hello, ");
        c.add("java!");
        // 判断集合中是否存在指定的元素
        System.out.println(c.contains("java!"));
        // 判断集合中是否存在指定的元素
        System.out.println(c.contains("java1!"));
    }
}
