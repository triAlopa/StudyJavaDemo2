package StuDemo8_14.E;

import java.util.*;

/**
 * E6类，用于演示Java中集合框架的不可变集合使用方法
 * 主要展示了Set、List和Map的不可变集合创建方式
 */
public class E6 {
    /**
     * 程序主方法，入口点
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 以下是Set集合的创建和使用方式（被注释）
        // 使用Set.of()方法创建不可变的Set集合
//        Set<Integer> integers = Set.of(1, 2, 3, 4, 7, 23, 658, 8);
        // 使用增强for循环遍历Set集合并打印每个元素
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

        // 以下是List集合的创建和使用方式（被注释）
        // 使用List.of()方法创建不可变的List集合
//        List<Integer> integers1 =  List.of(1, 2, 3, 4, 7, 23, 658, 8);
        // 使用增强for循环遍历List集合并打印每个元素
//        for (Integer i : integers1) {
//            System.out.println(i);
//        }
        //最多只能有10对键值对
        Map<Integer, Integer> integerIntegerMap = Map.of(1, 2, 3, 4, 7, 23, 658, 8);
        integerIntegerMap.forEach((o1,o2)-> System.out.println("k: "+o1+" v: "+o2));
        //如果想 添加多对不可变的map键值对，使用copyOf方法
        Map<Integer, Integer> integerIntegerMap1 = Map.copyOf(integerIntegerMap);
    }
}
