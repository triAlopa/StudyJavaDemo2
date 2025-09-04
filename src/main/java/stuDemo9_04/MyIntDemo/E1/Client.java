package stuDemo9_04.MyIntDemo.E1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
/**
 * 主方法，实现一个简单的客户端程序，可以向指定IP和端口发送消息
 * @param args 命令行参数，本程序未使用
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {

    // 打印提示信息，引导用户输入消息
        System.out.println("说吧，天黑之前你至少有三句话要说....");

        //发送端 向哪一个设备的哪个端口发送
        Socket socket = new Socket("127.0.0.1", 10086);

        while (true) {
            OutputStream os = socket.getOutputStream();

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            if ("886".equals(str)) break;
            os.write(str.getBytes());
        }
        socket.close();
    }
}
