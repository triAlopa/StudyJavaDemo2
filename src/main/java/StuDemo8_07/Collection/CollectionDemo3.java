package StuDemo8_07.Collection;


import java.util.ArrayList;

/*
它是JDK5之后出现的,其内部原理是一个Iterator迭代器
实现Iterable接口的类才可以使用迭代器和增强for
简化数组和Collection集合的遍历
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        for(String s:arrayList){
            System.out.println(s);
        }
        // arraylist.for

    }
}
