package stuDemo8_18.MyStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class streamDemo6 {
    public static void main(String[] args) {
          /*
            map                 转换流中的数据类型

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

        // 创建一个ArrayList集合对象，用于存储字符串数据
        ArrayList<String> list = new ArrayList<>();
        // 使用Collections.addAll()方法向集合中添加多个字符串元素
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");
        //需求：只获取里面的年龄并进行打印



        // 使用Lambda表达式实现Stream流的map转换和遍历
        // 将每个字符串元素按"-"分割，取第二个元素（年龄部分）转换为整数并打印
        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));

        // 使用Stream流处理集合（使用匿名内部类方式实现）
        // 1. 通过stream()方法获取流
        // 2. 使用map()方法对流中的数据进行转换，将字符串转换为整数
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                // 使用split()方法按"-"分割字符串
                String[] split = string.split("-");
                // �分割后的第二个元素是年龄部分
                String s = split[1];

                // 将字符串形式的年龄转换为整数并返回
                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s)); // 使用forEach遍历流中的每个元素并打印
    }
}
