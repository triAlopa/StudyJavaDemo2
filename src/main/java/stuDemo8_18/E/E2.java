package stuDemo8_18.E;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E2 {
    /*
       现在有两个ArrayList集合，分别存储6名男演员的名字和年龄以及6名女演员的名字和年龄。
       姓名和年龄中间用逗号隔开。
       比如：张三,23
       要求完成如下的操作：
       1，男演员只要名字为3个字的前两人
       2，女演员只要姓杨的，并且不要第一个
       3，把过滤后的男演员姓名和女演员姓名合并到一起
       4，将上一步的演员信息封装成Actor对象。
       5，将所有的演员对象都保存到List集合中。
       备注：演员类Actor，属性有：name，age

       男演员：  "蔡坤坤,24" , "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27"
       女演员：  "赵小颖,35" , "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33"
     */
    public static void main(String[] args) {
        // 创建存储男演员信息的ArrayList集合
        ArrayList<String> boyList=new ArrayList<>();
        // 使用Collections.addAll方法向boyList中添加男演员数据
        Collections.addAll(boyList,"蔡坤坤,24" , "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        // 创建存储女演员信息的ArrayList集合
        ArrayList<String> girlList=new ArrayList<>();
        // 使用Collections.addAll方法向girlList中添加女演员数据
        Collections.addAll(girlList,"赵小颖,35" , "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

       //男演员只要名字为3个字的前两人
        // 使用Stream流处理男演员数据
        // 1. 过滤出名字长度为3的男演员
        // 2. 使用limit限制只取前两个
        Stream<String> stream1 = boyList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);


//        stream1.forEach(s-> System.out.println(s));

        System.out.println("------------------");

        //女演员只要姓杨的，并且不要第一个
        // 使用Stream流处理女演员数据
        // 1. 过滤出姓杨的女演员
        // 2. 使用skip跳过第一个符合条件的元素
        Stream<String> stream2 = girlList.stream()
                .filter(s -> s.startsWith("杨"))
                .skip(1);



//        stream2.forEach(s-> System.out.println(s));

        Stream<Actor> actorStream = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])));

        System.out.println("------------------");
        List<Actor> actors = actorStream.collect(Collectors.toList());


        //把过滤后的男演员姓名和女演员姓名合并到一起
        // 合并两个流，并将结果收集到Map中
        // Map的key为演员姓名，value为演员年龄
//        Map<String, Integer> map    = Stream.concat(stream1, stream2)
//                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        // 创建存储Actor对象的ArrayList集合
//        ArrayList<Actor> actors=new ArrayList<>();
//        // 遍历Map中的每个键值对
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            // 根据键值对创建Actor对象
//            Actor actor = new Actor(entry.getKey(), entry.getValue());
//            // 将Actor对象添加到actors集合中
//            actors.add(actor);
//        }

        // 输出最终的演员列表
        System.out.println(actors);
    }
}
