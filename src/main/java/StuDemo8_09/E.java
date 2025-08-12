package StuDemo8_09;

import java.util.Comparator;
import java.util.TreeSet;

public class E {
/**
 * 主方法，演示使用TreeSet并自定义比较器进行字符串排序
 * @param args 命令行参数
 */
    public static void main(String[] args) {
        // 创建TreeSet集合，并指定自定义比较器
        // TreeSet是一个有序集合，这里通过自定义比较器来决定元素的排序方式
        TreeSet<String> strings=new TreeSet<>(( o1,  o2)-> {
                // 首先比较字符串长度
                int result=o1.length()-o2.length();
                // 如果长度相同，则按字典序比较
                result=result==0?o1.compareTo(o2):result;
                // 返回比较结果
                return result;
            }
    );

        // 向TreeSet中添加字符串元素
        // 由于使用了自定义比较器，元素会按照先长度后字典序的规则排序
        strings.add("c");        // 长度为1
        strings.add("ab");       // 长度为2
        strings.add("df");       // 长度为2
        strings.add("qwer");     // 长度为4

        // 输出排序后的集合
        // 预期输出应为: [c, ab, df, qwer]
        System.out.println(strings);
    }
}
