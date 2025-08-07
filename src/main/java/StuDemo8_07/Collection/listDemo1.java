package StuDemo8_07.Collection;

import java.util.ArrayList;
import java.util.List;
/*
| 方法名                          | 描述                                   |
  | ------------------------------- | -------------------------------------- |
  | void add(int index,E   element) | 在此集合中的指定位置插入指定的元素     |
  | E remove(int   index)           | 删除指定索引处的元素，返回被删除的元素 |
  | E set(int index,E   element)    | 修改指定索引处的元素，返回被修改的元素 |
  | E get(int   index)              | 返回指定索引处的元素                   |
 */
public class listDemo1 {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("hello");
        stringList.add("hello");
        stringList.add("hello");

        stringList.add(2,"java");
        System.out.println(stringList.toString());

        stringList.remove(3);
        System.out.println(stringList.toString());

        stringList.set(1,"unHello");
        System.out.println(stringList.toString());

        for (String s : stringList) {
            System.out.print(s+"  ");
        }
        /// /////////////////////////////////
        System.out.println("                ");

        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println(integers);
        integers.remove((Object) 1);
        System.out.println(integers);
    }
}
