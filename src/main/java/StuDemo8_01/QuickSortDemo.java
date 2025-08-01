package StuDemo8_01;

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

    private static void QuickFun(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        int baseNumber = arr[i];

        while (start != end) {
            while (true) {
                if (start >= end || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            while (true) {
                if (start >=end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        QuickFun(arr, i, start - 1);
        QuickFun(arr, start + 1, j);
    }
}
