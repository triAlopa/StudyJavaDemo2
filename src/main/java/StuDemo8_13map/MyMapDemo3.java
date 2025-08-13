package StuDemo8_13map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//三个课堂练习：
//
//练习一：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
//练习二：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
//练习三：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用lambda的形式进行遍历
public class MyMapDemo3 {
/**
 * 主方法，演示了HashMap的基本操作和多种遍历方式
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

        // 获取Map的Entry集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 使用for-each循环遍历Map
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
        // 使用Iterator遍历Map
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println("key: "+next.getKey()+" value: "+next.getValue());
        }
        // 使用Java 8的forEach方法遍历Map
        entries.forEach(s-> System.out.println("key: "+s.getKey()+" value: "+s.getValue()));
    }
}
