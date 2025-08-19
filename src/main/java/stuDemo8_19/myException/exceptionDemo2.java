package stuDemo8_19.myException;

public class exceptionDemo2 {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数数组
 */
    public static void main(String[] args) {
        // 定义一个整型数组并初始化
        int[] arr={1,2,3,4};

        try {
            // 尝试打印数组中索引为10的元素，这会导致数组索引越界异常
            System.out.println(arr[10]);
            //此处数组索引越界异常 ；导致创建了一个ArrayIndexOutOfBoundsException 对象
        } catch (ArrayIndexOutOfBoundsException e) {//捕获到自动创建的对象 对应就会执行catch里语句
            // 捕获数组索引越界异常并打印提示信息
            e.printStackTrace();
            System.out.println("索引越界了");
        }

        // 无论是否发生异常，都会执行这条打印语句
        System.out.println("执行此方法了吗？");
    }
}
