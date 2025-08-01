package StuDemo8_01;

/*
           插入排序：
               将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
               遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
               N的范围：0~最大索引

       */
public class insertDemo {
    public static void main(String[] args) {
        int[] arr = {3, 38, 44, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] newArr = insertFun1(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    private static int[] insertFun(int[] arr) {
        int index = findIndex(arr);
        System.out.println(index);
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    private static int[] insertFun1(int[] arr) {
        int startIndex = findIndex(arr);
        for (int j = startIndex; j < arr.length; j++) {
            int z = j;
            while (z > 0 && arr[z] < arr[z - 1]) {
                int temp = arr[z];
                arr[z] = arr[z - 1];
                arr[z - 1] = temp;
                z--;
            }
        }
        return arr;
    }


    private static int findIndex(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) return i;
        }
        return -1;
    }
}
