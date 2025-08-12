package StuDemo8_09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> integers=new TreeSet<>();
        integers.add(2);
        integers.add(5);
        integers.add(4);
        integers.add(3);
        integers.add(1);
//        System.out.println(integers);

        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        for (Integer i : integers) {
            System.out.println(i);
        }

        integers.forEach((integer)-> System.out.println(integer));

    }
}
