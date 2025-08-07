package StuDemo8_06.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*

 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        // 创建一个Collection集合
        Collection<String> c= new ArrayList<>();
        // 向集合中添加元素
        c.add("hello,");
        c.add("java!");
        c.add("java!");
        c.add("java!");

//        // 使用匿名内部类的方式遍历集合
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String string) {
//                // 打印集合中的元素
//                System.out.println(string);
//            }
//        });
        // 使用Lambda表达式的方式遍历集合
        c.forEach( string-> System.out.println(string));

    }
}
