package StuDemo8_01;




/*
            选择排序：
                1，从0索引开始，跟后面的元素一一比较。
                2，小的放前面，大的放后面。
                3，第一次循环结束后，最小的数据已经确定。
                4，第二次循环从1索引开始以此类推。

         */
public class selectionDemo {
     public static void main(String[] args) {
         //1.定义数组
         int[] arr = {2, 4, 5, 3, 1,1,11,7};
         int[] newArr = selectionFun(arr);
         for (int i = 0; i < newArr.length; i++) {
             System.out.print(newArr[i]+" ");
         }
     }

     private static int[] selectionFun(int[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if(arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
         return arr;
     }
 }
