package stuDemo8_18.MyMethod;

import java.util.Arrays;

public class myMethodDemo1 {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数
 */
    public static void main(String[] args) {

    // 创建一个整型数组并初始化
        Integer[] arr= {1,2,6,3,4,7,10,9};

    // 使用Arrays.sort方法对数组进行排序
    // 第二个参数使用方法引用myMethodDemo1的sortMethod方法作为排序规则
        Arrays.sort(arr,myMethodDemo1::sortMethod);
    // 增强for循环遍历并打印排序后的数组元素
        for (Integer i : arr) {
            System.out.println(i);
        }

    }

    public static int sortMethod(Integer o1,Integer o2){return o2-o1;}

}
