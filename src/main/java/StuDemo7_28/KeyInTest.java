package StuDemo7_28;


import java.util.ArrayList;
import java.util.Scanner;

//键盘录入 一些 1~100内数字 加入集合当中
//直到集合数字 之和超过 250 结束
public class KeyInTest {
    public static void main(String[] args) {
        //创建一个ArrayList集合，用于存储输入的数字
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        //创建一个Scanner对象，用于接收键盘输入
        Scanner sc = new Scanner(System.in);
        //使用while循环，不断接收键盘输入的数字，直到集合数字之和超过250
        while (true){
            //提示用户输入1~100整数
            System.out.println("请输入1~100整数");
            //将用户输入的数字赋值给num
            Integer num;
             num= sc.nextInt();
            //判断用户输入的数字是否在1~100之间，如果不在，则提示用户重新输入
            if(num>100||num<0) {
                System.err.println("输入1~100整数！！！你瞎啊");
                continue;
            }
            //将用户输入的数字添加到集合中
            integerArrayList.add(num);
            //调用flagNum方法，判断集合数字之和是否超过250，如果超过，则结束循环
            boolean flagNum =  flagNum(integerArrayList);
            if(flagNum)  return;
        }
    }

    //判断集合数字之和是否超过250
    private static boolean flagNum(ArrayList<Integer> integerArrayList){
        //定义一个变量sum，用于存储集合数字之和
        int sum =0;
        //遍历集合，将每个数字累加到sum中
        for (int i = 0; i < integerArrayList.size(); i++) {
            sum+=integerArrayList.get(i);
            //如果sum超过250，则输出提示信息，并返回true，结束循环
            if(sum>250) {
                System.out.println("你是一个250😁");
                return true;
            };
        }
        //如果sum没有超过250，则返回false，继续循环
        return false;
    }
}
