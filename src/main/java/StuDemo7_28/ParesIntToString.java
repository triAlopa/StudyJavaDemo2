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
        String strRegex = "[0-9]\\d{0,9}";
        String str = sc.nextLine();
        if (!str.matches(strRegex)) {
            System.err.println("请输入正确的数字");
        } else {
            System.out.println(paresIntToString(str));
        }
    }

    /*

    捏麻麻的 这个实现的好丑陋😅 狗脑要烧坏了
     */
    private static Integer paresIntToString(String string) {
        // 将字符串转换为整数
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            // 将字符串中的每个字符转换为整数
            int tempNum = (int) string.charAt(i) - 48;
            // 将转换后的整数累加到结果中
            result = result * 10 + tempNum;
        }
        return result;
    }
}
