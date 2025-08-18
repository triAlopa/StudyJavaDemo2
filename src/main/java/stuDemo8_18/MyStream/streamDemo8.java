package stuDemo8_18.MyStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamDemo8 {
    public static void main(String[] args) {
                /*
            collect(Collector collector)            收集流中的数据，放到集合中 (List Set Map)

            注意点：
                如果我们要收集到Map集合当中，键不能重复，否则会报错
       */

        // 创建一个ArrayList集合，并向其中添加多个字符串元素
        ArrayList<String> list = new ArrayList<>();
        // 使用Collections.addAll()方法向集合中添加多个字符串元素
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");
        //收集List集合当中
        //需求：我要把所有的男性收集起来
        List<String> list1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))  // 过滤出性别为男性的元素
                .collect(Collectors.toList());  // 将过滤后的元素收集到List集合中

        System.out.println(list1);  // 输出收集到的男性列表

        System.out.println("-----------------------------");


        Set<String> list2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))  // 过滤出性别为男性的元素
                .collect(Collectors.toSet());  // 将过滤后的元素收集到Set集合中

        list2.add("张无忌-男-15");  // 向Set集合中添加一个元素（Set集合不允许重复元素）
        System.out.println(list2);  // 输出Set集合内容

        System.out.println("-----------------------------");



        // 使用匿名内部类的方式将流元素收集到Map集合中
        Map<String, Integer> list3 = list.stream().filter(s -> "男".equals(s.split("-")[1]))  // 过滤出性别为男性的元素
                .collect(Collectors.toMap(new Function<String, String>() {  // 指定Map的键映射方式
                    @Override
                    public String apply(String string) {
                        return string.split("-")[0];  // 使用姓名作为键
                    }
                }, new Function<String, Integer>() {  // 指定Map的值映射方式
                    @Override
                    public Integer apply(String string) {
                        return Integer.parseInt(string.split("-")[2]);  // 使用年龄作为值
                    }
                }));
        System.out.println(list3);  // 输出Map集合内容

        System.out.println("-----------------------------");


        // 使用Lambda表达式简化Map集合的收集方式
        Map<String, Integer> list4 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))  // 过滤出性别为男性的元素
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(list4);
    }
}
