package stuDemo8_18.MyMethod;

import java.util.ArrayList;
import java.util.Collections;

public class myMethodDemo2 {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个String类型的ArrayList集合
        ArrayList<String> list=new ArrayList<>();
    // 使用Collections.addAll()方法向集合中添加多个元素
        Collections.addAll(list,"1","2","3","4");
    // 将集合转换为流，使用map方法将字符串转换为整数，然后遍历并打印每个元素
        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
