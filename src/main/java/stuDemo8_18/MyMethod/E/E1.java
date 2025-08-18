package stuDemo8_18.MyMethod.E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class E1 {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数
 */
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");

        //收集到student类型的数组
        // 使用Stream流将字符串列表转换为Student对象数组
        // 通过map方法应用Student类的构造函数来创建Student对象
        // 最后使用toArray方法将流转换为Student数组
        Student[] arr1 = list.stream()
                .map(Student::new)
                .toArray(Student[]::new);

        // 创建一个新的ArrayList用于存放Student对象
        ArrayList<Student> list1 = new ArrayList<>();

        // 注释掉的for循环，原本用于将Student对象添加到list1中
//        for (Student s : arr1) {
////            System.out.println(s);
//            list1.add(s);
//        }
// 使用Collections.addAll方法将Student数组中的所有元素添加到list1中
        Collections.addAll(list1,arr1);
        // 打印分隔线
        System.out.println("--------------------");
        // 使用Stream流从list1中提取所有学生的姓名，并转换为String数组
        // 通过map方法应用Student类的getName方法获取姓名
        // 最后使用toArray方法将流转换为String数组
        String[] arr2 = list1.stream()
                .map(Student::getName)
                .toArray(String[]::new);
        // 打印姓名数组
        System.out.println(Arrays.toString(arr2));

        // 打印分隔线
        System.out.println("----------");
        // 使用Stream流从list1中获取所有学生的字符串表示形式，并转换为String数组
        // 通过map方法应用Student类的ToString方法获取字符串表示
        // 最后使用toArray方法将流转换为String数组
        String[] arr3 = list1.stream()
                .map(Student::ToString)
                .toArray(String[]::new);
        // 打印学生字符串数组
        System.out.println(Arrays.toString(arr3));
    }
}
