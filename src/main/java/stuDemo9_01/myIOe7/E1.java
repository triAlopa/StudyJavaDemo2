package stuDemo9_01.myIOe7;

import javax.net.ssl.CertPathTrustManagerParameters;
import java.io.*;
import java.util.Scanner;

public class E1 {
/**
 * 主方法，实现用户登录验证功能
 * 从文件中读取用户信息，验证用户输入的账号和密码
 * 如果连续输错3次，则账号被锁定
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 使用BufferedReader读取文件中的用户信息
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/stuDemo9_01/myIOe7/userInfo.txt"));
    // 读取文件第一行内容
        String str = br.readLine();
    // 关闭BufferedReader
        br.close();
    // 将字符串按"&"分割，获取用户名、密码和错误次数
        String[] s1 = str.split("&");
    // 获取错误次数并转换为整数
        String s = s1[2].split("=")[1];
        int temp = Integer.parseInt(s);
    // 创建Scanner对象，用于获取用户输入
        Scanner sc = new Scanner(System.in);
    // 提示用户输入账号
        System.out.println("请输入账号： ");
    // 读取用户输入的账号
        String inputName = sc.nextLine();
    // 提示用户输入密码
        System.out.println("请输入密码： ");
    // 读取用户输入的密码
        String inputPassword = sc.nextLine();
    // 检查账号是否已被锁定（错误次数达到3次）
        if (temp == 3) {
        // 输出账号锁定信息
            System.err.println("账号已经锁定，请充值");
        // 退出程序
            System.exit(0);
        }
    // 验证用户输入的账号和密码是否正确
        if (s1[0].split("=")[1].equals(inputName) && s1[1].split("=")[1].equals(inputPassword)) {
        // 登录成功，输出success
            System.out.println("success");
        } else {
        // 登录失败，错误次数加1
            temp++;
        // 重新构建用户信息字符串
            String string = "username=" + s1[0].split("=")[1] + "&password=" + s1[1].split("=")[1] + "&count=" + temp;
        // 使用BufferedWriter将更新后的用户信息写回文件
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/stuDemo9_01/myIOe7/userInfo.txt"));
        // 写入字符串
            bw.write(string);
        // 关闭BufferedWriter
            bw.close();
        // 输出登录失败信息
            System.err.println("error");
        }
    }
}
