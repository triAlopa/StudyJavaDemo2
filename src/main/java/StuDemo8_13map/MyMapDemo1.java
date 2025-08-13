package StuDemo8_13map;

import java.util.HashMap;
import java.util.Map;

/**
 * MyMapDemo1类
 * 演示Map集合的基本使用
 */
public class MyMapDemo1 {
    /**
     * 程序入口方法
     * @param args 命令行参数
     */
    public static void main(String[] args) {
         /*
            V put(K key,V value)                    添加元素
            V remove(Object key)                    根据键删除键值对元素
            void clear()                            移除所有的键值对元素
            boolean containsKey(Object key)         判断集合是否包含指定的键
            boolean containsValue(Object value)     判断集合是否包含指定的值
            boolean isEmpty()                       判断集合是否为空
            int size()                              集合的长度，也就是集合中键值对的个数
        */

        //创建集合对象
        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        Map<String,String> map=new HashMap<>(); // 创建一个HashMap集合对象，键和值都是String类型
        map.put("001","zhangsan"); // 向集合中添加键值对，键为"001"，值为"zhangsan"
        map.put("002","lisi");     // 向集合中添加键值对，键为"002"，值为"lisi"
        map.put("003","wangwu");   // 向集合中添加键值对，键为"003"，值为"wangwu"
        //添加主键一样的，会覆盖其值
        map.put("003","wangwu6");  // 由于键"003"已存在，此操作会更新该键对应的值为"wangwu6"
        System.out.println(map);   // 打印集合中的所有键值对

        System.out.println(map.containsKey("001"));//true，判断集合中是否包含键为"001"的键值对
        System.out.println(map.containsKey("0011"));//false，判断集合中是否包含键为"0011"的键值对
        System.out.println(map.containsValue("zhangsan0"));//false，判断集合中是否包含值为"zhangsan0"的键值对

        System.out.println(map.size());//输出集合中键值对的数量

        System.out.println(map.remove("001"));//移除键为"001"的键值对，并返回其值"zhangsan"

        System.out.println(map.size());//再次输出集合中键值对的数量，此时数量已减少
    }
}
