package StuDemo8_06.list;


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
        Collection<String> c= new ArrayList<>();
        c.add("hello, ");
        c.add("java!");
        System.out.println(c.size());
        System.out.println(c.toString());

        c.remove("hello, ");
        System.out.println(c.toString());

        c.clear();
        System.out.println(c.toString()+"1 ");

        c.add("hello, ");
        c.add("java!");
        System.out.println(c.contains("java!"));
        System.out.println(c.contains("java1!"));
    }
}
