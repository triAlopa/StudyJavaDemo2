package StuDemo8_13map;


//Map集合的第一种遍历方式

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//三个课堂练习：
//
//练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
//练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
//练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
public class MyMapDemo2 {
/**
 * 主方法，演示了HashMap的基本操作和遍历方式
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个HashMap实例，键和值都是String类型
        Map<String,String> map=new HashMap<>();


    // 向Map中添加三个键值对
        map.put("001","zhangsan");  // 学号001对应学生zhangsan
        map.put("002","lisi");
        map.put("003","wangwu");      // 学号002对应学生lisi
    // 学号003对应学生wangwu

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);


//        String s = map.get("001");
    // 以下是被注释掉的代码，展示了不同的Map遍历方式
    // 通过键获取值并打印
//        System.out.println(s);

        Set<String> strings = map.keySet();
    // 获取Map中所有的键
//        Iterator<String> it = strings.iterator();
    // 以下是被注释掉的迭代器遍历方式
//        while (it.hasNext()){
//            String str = map.get(it.next());
//            System.out.println(str);
//        }
//        for (String s : strings) {
    // 以下是被注释掉的for-each循环遍历方式
//            System.out.println(map.get(s));
//        }
        strings.forEach(s-> System.out.println(map.get(s)));
    // 使用Lambda表达式遍历Map并打印值
    }
}
