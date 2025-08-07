package StuDemo8_06.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 迭代器,集合的专用遍历方式
  - Iterator<E> iterator(): 返回此集合中元素的迭代器,通过集合对象的iterator()方法得到

- Iterator中的常用方法

 	boolean hasNext(): 判断当前位置是否有元素可以被取出
  	E next(): 获取当前位置的元素,将迭代器对象移向下一个索引位置
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c= new ArrayList<>();
        c.add("hello, ");
        c.add("java!");
        c.add("java!");
        c.add("java!");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            iterator.next();
            System.out.println(string);
        }

    }
}
