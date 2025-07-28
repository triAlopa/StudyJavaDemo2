package StuDemo7_28;


import java.util.Scanner;

//自己实现ParesInt 方法
//大概是 字符串变为 int
public class ParesIntToString {
    public static void main(String[] args) {
//        int num = Integer.parseInt("666") - 66;
//        System.out.println(num);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        //字符串格式校验
        String strRegex = "[0-9]\\d{0,9}";
        if (!str.matches(strRegex)) {
            System.err.println("字符串校验错误");
        } else {
            System.out.println(paresIntToString(str));
        }
    }

    /*

    捏麻麻的 这个实现的好丑陋😅 狗脑要烧坏了
     */
    private static Integer paresIntToString(String string) {
//        //将字符串转换为字符数组
//        char[] charArray = string.toCharArray();
//        //创建一个与字符数组等长的整数数组
//        int[] intArray = new int[charArray.length];
//        //将字符数组中的每个字符转换为对应的整数，并存储到整数数组中
//        for (int i = 0; i < charArray.length; i++) {
//            intArray[i] = charArray[i] - 48;
//        }
//        //初始化结果为0
//        int result = 0;
//        //遍历整数数组
//        for (int i = 0; i < intArray.length; i++) {
//            //计算当前位数的权重
//            int tempNum = intArray.length - i - 1;
//            int sum = 0;
//            //如果当前位是最后一位，直接将当前位的值加到结果中
//            if (intArray.length - 1 == i) {
//                result += intArray[i];
//                return result;
//            }
//            //计算当前位的值乘以权重
//            for (int j = 0; j < tempNum; j++) {
//                if (j == tempNum - 1) {
//                    sum = intArray[i] *= 10;
//                    continue;
//                }
//                intArray[i] *= 10;
//            }
//            //将当前位的值加到结果中
//            result = result + sum;
//        }
//        //返回结果
//        return result;

        int result=0;
        for (int i = 0; i < string.length(); i++) {
             int tempNum = (int) string.charAt(i) - 48;
             result=result*10+tempNum;
        }
        return result;
    }
}
