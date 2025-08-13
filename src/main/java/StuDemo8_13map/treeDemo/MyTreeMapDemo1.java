package StuDemo8_13map.treeDemo;


import java.util.Comparator;
import java.util.TreeMap;

public class MyTreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>(((o1, o2) -> o2-o1));
        treeMap.put(1,"方便面");
        treeMap.put(3,"方便面3");
        treeMap.put(2,"方便面2");

        System.out.println(treeMap);


    }
}
