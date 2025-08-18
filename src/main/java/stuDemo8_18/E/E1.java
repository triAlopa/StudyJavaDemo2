package stuDemo8_18.E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class E1 {
/*
 * 主方法：演示使用Java Stream API处理集合数据
 * 1. 创建一个ArrayList并添加字符串数据
 * 2. 使用Stream API过滤并转换数据为Map
 * 3. 输出处理后的结果
 */
    public static void main(String[] args) {
        // 创建一个ArrayList并添加1到10的整数
        ArrayList<String> list = new ArrayList<>();
        // 使用Collections.addAll方法批量添加元素
        // 每个元素格式为"姓名,年龄"的字符串
        Collections.addAll(list,"张三,23","李四,24","王五,25");

        // 使用Stream API处理集合
        // 1. 将集合转换为流
        // 2. 过滤出年龄大于等于24的数据
        // 3. 将过滤后的数据收集为Map，其中键为姓名，值为年龄
        Map<String, Integer> list1 = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)  // 过滤条件：年龄>=24
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(list1);
    }
}
