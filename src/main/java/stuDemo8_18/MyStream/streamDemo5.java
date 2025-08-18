package stuDemo8_18.MyStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class streamDemo5 {
    public static void main(String[] args) {
         /*
            distinct            元素去重，依赖(hashCode和equals方法)
            concat              合并a和b两个流为一个流

            注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
            注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
        */

        // 创建一个ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        // 使用Collections.addAll()方法向集合中添加多个元素
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        // 再次向集合中添加重复元素
        Collections.addAll(list, "张无忌", "周芷若");

        // 遍历流中的所有元素并打印
        list.stream().forEach(s-> System.out.println(s));

        System.out.println("------------------------");

        // 对流中的元素进行去重操作后遍历并打印
        list.stream().distinct().forEach(s-> System.out.println(s));

        System.out.println("------------------------");
        // 合并去重后的流和另一个包含"张三"的流，然后遍历并打印合并后的所有元素
        Stream.concat(list
                .stream().
                distinct(),Stream.of("张三")).forEach(s-> System.out.println(s));

    }

}
