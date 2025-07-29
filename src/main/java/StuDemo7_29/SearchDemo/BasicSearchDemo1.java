package StuDemo7_29.SearchDemo;


//基本查找  /顺序查找
//就是在一堆数据里面是否存在 某个数据
public class BasicSearchDemo1 {
    public static void main(String[] args) {
        // 定义一个整型数组
        int [] arr=new int[]{1,12,3,4,5,20,50,9,0};
        // 定义一个整型变量
        int num=6;
        // 调用searchFun方法，传入数组arr和变量num，将返回值赋给result
        boolean result = searchFun(arr, num);
        // 如果result为true，则输出"执行顺序算法，存在"
        if(result) System.out.println("执行顺序算法，存在");
        // 否则输出"不存在"
        else System.err.println("不存在");
    }
    private static boolean searchFun(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) return true;
        }
        return false;
    }
}
