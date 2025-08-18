package stuDemo8_18.MyStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class streamDemo4 {
    public static void main(String[] args) {
          /*
            filter              过滤：用于通过设置的条件过滤出元素
            limit               获取前几个元素：对流进行截取，只取前N个元素
            skip                跳过前几个元素：跳过前N个元素，返回剩下的元素

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

        // 创建ArrayList集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        //filter              过滤：过滤出以"张"开头且长度为3的姓名
        list.stream()
                .filter(s -> s.startsWith("张"))    // 过滤出以"张"开头的姓名
                .filter(s -> s.length() == 3)       // 过滤出长度为3的姓名
                .forEach(s -> System.out.println(s)); // 遍历输出过滤后的结果

        System.out.println("------------------------");
        //只获取前几个元素：获取集合中的前3个元素并输出
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("------------------------");

        //从第几个后开始截取：跳过前3个元素，输出剩下的元素
        list.stream().skip(3).forEach(s -> System.out.println(s));



        // 创建流并执行链式操作
        Stream<String> stream1 = list.stream().limit(3);    // 获取前3个元素的流
        Stream<String> stream2 = stream1.skip(2);            // 跳过前2个元素，保留第3个元素
        stream2.forEach(s-> System.out.println(s));          // 输出第3个元素
       // 注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
//        stream has already been operated upon or closed//流已经关闭或运行

        // 尝试再次使用已关闭的stream1会抛出异常
        Stream<String> limit = stream1.limit(2);             // 这行代码会抛出IllegalStateException异常
    }
}
