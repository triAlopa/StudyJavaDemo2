package StuDemo8_01.mySort;

public class QuickSortDemo {
    public static void main(String[] args) {
        /*
       快速排序：
           第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
           比基准数小的全部在左边，比基准数大的全部在右边。
           后面以此类推。
     */
        int[] newArr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickFun(newArr, 0, newArr.length - 1);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

// 快速排序函数
    private static void QuickFun(int[] arr, int i, int j) {
        // 定义起始位置和结束位置
        int start = i;
        int end = j;

        // 如果起始位置大于结束位置，则返回
        if (start > end) {
            return;
        }

        // 定义基准数
        int baseNumber = arr[i];

        // 当起始位置不等于结束位置时，进行循环
        while (start != end) {
            // 从右向左寻找小于基准数的数
            while (true) {
                // 如果起始位置大于等于结束位置，或者当前数小于基准数，则跳出循环
                if (start >= end || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            // 从左向右寻找大于基准数的数
            while (true) {
                // 如果起始位置大于等于结束位置，或者当前数大于基准数，则跳出循环
                if (start >=end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            // 交换起始位置和结束位置的数
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // 交换基准数和起始位置的数
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        // 递归调用快速排序函数，对基准数左边的数进行排序
        QuickFun(arr, i, start - 1);
        // 递归调用快速排序函数，对基准数右边的数进行排序
        QuickFun(arr, start + 1, j);
    }
}
