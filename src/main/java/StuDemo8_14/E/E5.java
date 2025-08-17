package StuDemo8_14.E;


//可变参数
public class E5 {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数
 */
    public static void main(String[] args) {
        // 调用getSum方法，传入多个整数参数，并打印返回结果
        System.out.println(getSum(1, 2, 34, 4, 4, 2, 3));
    }

/**
 * 计算可变参数的和
 * @param a 可变参数，表示需要相加的整数
 * @return 返回所有参数相加的和
 */
    private static int getSum(int...a){
        int rs=0; // 用于存储累加结果
        for (int i : a) { // 使用增强for循环遍历可变参数数组
            rs=rs+i; // 累加每个元素的值
        }
        return rs; // 返回最终的累加结果
    }
}
