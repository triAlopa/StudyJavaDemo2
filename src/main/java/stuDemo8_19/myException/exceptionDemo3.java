package stuDemo8_19.myException;

public class exceptionDemo3 {
    public static void main(String[] args) {
        // 定义一个整型数组并初始化
        int[] arr={1,2,3,4};


        try {
            // 尝试打印数组中索引为10的元素，这会导致数组索引越界异常
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4

            e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
                                // at stuDemo8_19.myException.exceptionDemo3.main(exceptionDemo3.java:11)

            System.out.println(e.getMessage());//Index 10 out of bounds for length 4
        }
    }
}
