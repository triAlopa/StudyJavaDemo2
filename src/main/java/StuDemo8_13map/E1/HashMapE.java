package StuDemo8_13map.E1;

import StuDemo8_13map.E.Student;

import java.util.*;

public class HashMapE {
/**
 * 主方法，用于演示随机生成字符串并统计出现次数
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 定义一个包含四个字母的字符串数组
        String[] arr = {"A", "B", "C", "D"};  // 字母数组，用于随机选择字母
    // 创建Random对象用于生成随机数
        Random r = new Random();  // 随机数生成器实例
    // 创建ArrayList集合用于存储随机生成的字母
        ArrayList<String> list = new ArrayList<>();  // 动态数组列表，用于存储随机字母
    // 循环80次，每次从数组中随机选择一个字母添加到列表中
        for (int i = 0; i < 80; i++) {  // 循环80次，生成80个随机字母
        // 生成随机索引，范围在0到数组长度之间
            int index = r.nextInt(arr.length);  // 生成0-3之间的随机索引
        // 根据随机索引获取对应的字母
            String s = arr[index];  // 根据索引获取字母
        // 将字母添加到列表中
            list.add(s);  // 将字母添加到列表中
        }
    // 创建HashMap集合用于统计每个字母出现的次数
        HashMap<String, Integer> hashMap = new HashMap<>();  // 哈希映射，用于统计字母出现次数

    // 遍历列表，统计每个字母出现的次数
        for (int i = 0; i < list.size(); i++) {  // 遍历列表中的每个字母
        // 如果字母已经在map中存在
            if (hashMap.containsKey(list.get(i))) {  // 检查字母是否已在map中
            // 获取当前字母的计数
                Integer temp = hashMap.get(list.get(i));  // 获取当前字母的计数
            // 计数加1
                temp++;  // 计数加1
            // 更新map中的计数
                hashMap.put(list.get(i),temp);  // 更新字母的计数
            } else hashMap.put(list.get(i), 1);  // 如果字母不在map中，添加并设置计数为1
        }

        System.out.println(hashMap);  // 输出每个字母及其出现次数
        Integer max=0;  // 用于存储最大出现次数
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();  // 获取map的键值对集合
        for (Map.Entry<String, Integer> entry : entries) {  // 遍历键值对
            Integer value = entry.getValue();  // 获取当前字母的出现次数
            if(value>max) max=value;  // 更新最大出现次数
        }
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();  // 再次获取map的键值对集合
        for (Map.Entry<String, Integer> entry : entrySet) {  // 遍历键值对
            if(entry.getValue()==max) System.out.println(entry.getKey());  // 输出出现次数最多的字母
        }
    }
}
