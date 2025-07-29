package StuDemo7_29.SearchDemo;


//二分查找 /折半查找
//最大索引 +最小索引/2 =校验索引
//若不是
//比要找的小  在另一侧 最小索引就为校验索引+1
public class BinarySearchDemo1 {
    public static void main(String[] args) {
        // 定义一个整型数组
        int[] arr = new int[]{7, 23, 79, 81, 103, 127, 131, 147};
        // 定义要查找的数字
        int searchNum = 147;
        // 调用BinaryFun方法，输出结果
        System.out.println(BinaryFun(searchNum, arr));
    }

// 二分查找函数，返回搜索数字在数组中的索引
    private static int BinaryFun(int searchNum, int[] arr) {
        // 定义最小索引
        int min = 0;
        // 定义最大索引
        int max = arr.length - 1;
        // 循环查找
        while(true) {
            // 计算中间索引
            int mid = (min + max) / 2;
            // 如果最小索引大于最大索引，说明没有找到，返回-1
            if(min>max) return -1;
            // 如果中间索引的值等于搜索数字，返回中间索引
            if (arr[mid] == searchNum) return mid;
            // 如果中间索引的值小于搜索数字，将最小索引设为中间索引加1
            else if (arr[mid] < searchNum) {
                min = mid + 1;
            // 如果中间索引的值大于搜索数字，将最大索引设为中间索引减1
            } else if (arr[mid] > searchNum) {
                max = mid - 1;
            }
        }
    }
}
