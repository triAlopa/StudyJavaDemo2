package StuDemo7_29.SearchDemo;


import java.util.ArrayList;

//基本查找  /顺序查找
//就是在一堆数据里面是否存在 某个数据
//
 // 1.查找数字在索引的位置
 // 2.查找数字在索引的位置重复的可能性
public class BasicSearchDemo2 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,6,5,6,8,9,3,22,55,6};
        int num=6;
//        int result = searchFun(arr, num);
//        if(result>0) System.out.println("利用基本查找，其索引:"+result);
//        else System.err.println("Not Found!");
        ArrayList<Integer> integerArrayList = searchFun1(arr, num);
        if(integerArrayList!=null){
            System.out.println("利用基本查找，出现次数:"+integerArrayList.size());
            System.out.println("索引分别在 ：");
            for (int i = 0; i < integerArrayList.size(); i++) {
                System.out.print(integerArrayList.get(i)+ "  ");
            }
        }else {
            System.err.println("Not Found!");
        }
    }
    //查找数字在索引的位置
    private static int searchFun(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]) return i;
        }
    return -1;
    }
    //查找数字在索引的位置重复的可能性
    private static ArrayList<Integer> searchFun1(int[] arr, int num){
        //创建一个ArrayList用于存储数字在索引的位置
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //如果数组中的元素等于给定的数字
            if(arr[i]==num){
                //将索引位置添加到ArrayList中
                integerArrayList.add(i);
            }
        }
        //如果ArrayList不为空，则返回ArrayList，否则返回null
        return !integerArrayList.isEmpty() ?integerArrayList:null;
    }
}
