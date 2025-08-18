package stuDemo8_18.MyStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/*
        单列集合      default Stream<E> stream()                           Collection中的默认方法
        双列集合      无                                                   无法直接使用stream流
        数组          public static <T> Stream<T> stream(T[] array)        Arrays工具类中的静态方法
        一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
*/
public class streamDemo2 {
/**
 * 演示不同类型集合和数组如何使用Stream流进行操作
 */
    public static void main(String[] args) {
//        单列集合      default Stream<E> stream()                           Collection中的默认方法
        ArrayList<String> list1=new ArrayList<>();
        list1.add("11");
        list1.add("22");
        list1.add("33");
    // 使用单列集合的stream()方法获取流，并遍历输出元素
        list1.stream().forEach(s-> System.out.println(s));

        System.out.println("============================");

        //双列集合      无                                                   无法直接使用stream流
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        //keySet()
        hm.keySet().stream().forEach(s-> System.out.println("key: "+s+" value: "+hm.get(s)));
        //entrySet()
        hm.entrySet().stream().forEach(s-> System.out.println(s));

        System.out.println("============================");

        int[] arr={1,2,3,4,5,6,7};
        Arrays.stream(arr).forEach(s-> System.out.println(s));

        System.out.println("============================");

        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }
}
