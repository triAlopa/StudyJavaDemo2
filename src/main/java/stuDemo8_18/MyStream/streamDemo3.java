package stuDemo8_18.MyStream;

import java.util.stream.Stream;

public class streamDemo3 {
/**
 * 主方法，演示了Stream处理数组的差异
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个整型数组
        int[] arr = {1, 2, 3};

    // 使用Stream处理整型数组，输出的是数组对象的哈希值，而不是数组元素
    // 因为整型数组不能直接被Stream流处理，需要使用Arrays.stream()方法
        //[I@6d311334
        Stream.of(arr).forEach(s -> System.out.println(s));

    // 创建一个字符串数组
        String[] arr1 = {"1", "2", "3"};
    // 使用Stream处理字符串数组，可以正确输出数组中的每个元素
        Stream.of(arr1).forEach(s -> System.out.println(s));
        //1
        //2
        //3
    }
}
