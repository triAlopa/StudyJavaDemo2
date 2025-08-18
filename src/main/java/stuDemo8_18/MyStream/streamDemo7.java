package stuDemo8_18.MyStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class streamDemo7 {
    public static void main(String[] args) {
         /*
            void forEach(Consumer action)           遍历集合中的每个元素并执行指定操作
            long count()                            统计流中元素的总数量
            toArray()                               收集流中的数据，放到数组中
       */

        // 创建一个ArrayList集合对象，用于存储字符串元素
        ArrayList<String> list = new ArrayList<>();
        // 使用Collections.addAll()方法向集合中添加多个元素
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        // 使用stream()方法获取流，然后使用forEach()方法遍历并打印集合中的每个元素
        list.stream().forEach(s-> System.out.println(s));

        // 打印分隔线，用于区分不同的输出结果
        System.out.println("---------------");

        // 使用stream()方法获取流，然后使用count()方法统计集合中元素的数量，并将结果打印
        long count = list.stream().count();
        System.out.println(count);

        // 打印分隔线，用于区分不同的输出结果
        System.out.println("---------------");

        // 使用stream()方法获取流，然后使用toArray()方法将流中的元素收集到Object数组中，并打印数组内容
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));

        // 打印分隔线，用于区分不同的输出结果
        System.out.println("---------------");

        // 使用stream()方法获取流，然后使用toArray()方法并指定IntFunction函数接口，将流中的元素收集到String数组中，并打印数组内容
        String[] arr2= list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr2));

        // 打印分隔线，用于区分不同的输出结果
        System.out.println("---------------");

        // 使用stream()方法获取流，然后使用toArray()方法并使用Lambda表达式将流中的元素收集到String数组中，并打印数组内容
        String[] arr3 = list.stream().toArray(integer -> new String[integer]);
        System.out.println(Arrays.toString(arr3));
    }
}
