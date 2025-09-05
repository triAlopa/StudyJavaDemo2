package stuDemo9_04.MyIntDemo.E2;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


//做一个带有登录，注册的无界面，控制版的多人聊天室。
public class chatClient {
    static Socket s;

    static {
        try {
            s = new Socket("127.0.0.1", 10087);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public chatClient() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        System.out.println("服务器已经连接成功");

        //==============欢迎来到黑马聊天室================
        //1登录
        //2注册
        //请输入您的选择：
        System.out.println("==============欢迎来到黑马聊天室================");

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("1注册");
            System.out.println("2登录");
            System.out.println("3退出");
            System.out.println("请输入您的选择：");
            String str = sc.nextLine();
            switch (str) {
                case "1" -> {

                }
                case "2" -> {
                    login(s);
//                    System.out.println("请输入账号: ");
//                    String userName = sc.nextLine();
//                    System.out.println("请输入密码: ");
//                    s.getInputStream();
//                    String password = sc.nextLine();
//                    bos.write(("username=" + userName + "&password=" + password).getBytes());
//                    bos.flush();
//                    s.shutdownOutput();


//                    BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//                    String string = br.readLine();
//
//                    System.out.println(string);

//                    if (flag) {
//                        System.out.println("登录成功");
//                        break;
//                    } else {
//                        System.out.println("登陆失败");
//                    }
                }
                case "3" -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("选择有误，请重新选择");
                }
            }
        }


    }

    private static void login(Socket s) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号: ");
        String userName = sc.nextLine();
        System.out.println("请输入密码: ");
        s.getInputStream();
        String password = sc.nextLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        bw.write("login");
        bw.newLine();
        bw.flush();
        //拼接
        StringBuilder sb = new StringBuilder();
        //username=zhangsan&password=123
        sb.append("username=").append(userName).append("&password=").append(password);


        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

//        s.shutdownOutput();

        //接收数据
        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = br.readLine();
        //1：登录成功  2 密码有误   3 用户名不存在
        if ("1".equals(line)) {
            System.out.println("登陆成功，开始聊天");
            new Thread(new ClientMyRunnable(s)).start();
            talkAll(bw);
        } else if ("2".equals(line)) {
            System.out.println("密码输入错误");
        } else if ("3".equals(line)) {
            System.out.println("用户名不存在");
        }


    }

    private static void talkAll(BufferedWriter bw) {
        System.out.println("请输入聊天内容...");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String msg = sc.nextLine();
            try {
                bw.write(msg);
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


