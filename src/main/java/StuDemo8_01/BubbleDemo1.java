package StuDemo8_01;

/*
           冒泡排序：
           核心思想：
           1，相邻的元素两两比较，大的放右边，小的放左边。
           2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
           3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
       */
public class BubbleDemo1 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr=new int[]{2,4,5,1,3,10,0};
        // 调用冒泡排序函数，对数组进行排序
        int[] newArr = BubbleFun(arr);
        // 遍历排序后的数组，并输出
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

// 冒泡排序函数
    private static int[] BubbleFun(int[] arr) {
        // 获取数组长度
        int len=arr.length;
        // 当数组长度不为0时，进行循环
        while (len!=0){
            // 遍历数组
            for (int i = 0; i < len-1 ; i++) {
                // 如果前一个元素大于后一个元素，则交换位置
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            // 数组长度减1
            len--;
        }
        // 返回排序后的数组
        return arr;
    }
}
