package stuDemo9_04.MyIntDemo.E1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务端 设定端口号 10086
        ServerSocket ss=new ServerSocket(10086);

        //等待接收 并返回
        Socket socket = ss.accept();

        //获取输入流
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int a=0;
        while ((a=isr.read())!=-1) {
            System.out.print((char) a);
        }

        socket.close();
        ss.close();
    }
}
