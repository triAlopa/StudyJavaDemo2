package StuDemo7_28;


import java.util.ArrayList;

// 实现将一个10进制的整数 转为 二进制的字符串
public class toBinaryString {
    public static void main(String[] args) {
        System.out.println(toBinaryStringBak(6));
    }
// 将整数转换为二进制字符串
    private static String toBinaryString(int Number){
        // 创建一个ArrayList，用于存储二进制数
        ArrayList<Integer> arrayList=new ArrayList<>();
        // 当Number不为0时，循环执行
        while (Number!=0){
            // 将Number除以2的余数添加到ArrayList中
            arrayList.add(Number%2);
            // 将Number除以2
            Number/=2;
        }
        // 创建一个空字符串，用于存储结果
        String res="";
        // 遍历ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
              // 将ArrayList中的元素从后往前添加到结果字符串中
              res+=arrayList.get(arrayList.size()-i-1);
        }
        // 返回结果字符串
        return res;
    }
    private static String toBinaryStringBak(int NUmber){
        StringBuilder sb=new StringBuilder();
        while (NUmber!=0){
            int tempNum=NUmber%2;
            sb.insert(0,tempNum);
            NUmber/=2;
        }
        return sb.toString();
    }
}
