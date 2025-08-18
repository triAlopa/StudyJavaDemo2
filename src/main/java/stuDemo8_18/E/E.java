package stuDemo8_18.E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class E {
/**
 * 主方法，演示Java Stream API的使用
 * 通过过滤操作筛选出偶数
 */
    public static void main(String[] args) {
        // 创建一个ArrayList并添加1到10的整数
        ArrayList<Integer> list = new ArrayList<>();
        // 使用Collections.addAll方法批量添加元素
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        // 使用Stream API进行流操作
        // 1. 将集合转换为Stream
        // 2. 使用filter方法筛选出偶数（能被2整除的数）
        // 3. 将筛选后的结果收集为新的List
        List<Integer> list1 = list.stream()
                .filter(s -> s % 2 == 0)  // 筛选条件：当前元素能被2整除
                .collect(Collectors.toList());  // 将结果收集到List中

        // 打印筛选后的结果
        System.out.println(list1);
    }
}
