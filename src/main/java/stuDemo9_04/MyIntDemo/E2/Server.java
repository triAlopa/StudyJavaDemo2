package stuDemo9_04.MyIntDemo.E2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
/**
 * 这是一个简单的Socket服务端程序
 * 它监听10086端口，接收客户端发送的数据，并打印出来
 * 然后向客户端发送"已接受信息完毕"的响应
 * 最后关闭socket和serverSocket
 */
    public static void main(String[] args) throws IOException {
    // 创建一个ServerSocket对象，监听10086端口
        ServerSocket ss = new ServerSocket(10086);

    // 等待客户端连接，这是一个阻塞方法
        Socket socket = ss.accept();

    // 创建一个InputStreamReader，用于读取客户端发送的数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int a = 0;
    // 循环读取客户端发送的数据，直到读取到-1（表示数据结束）
        while ((a = isr.read()) != -1) {
            System.out.print((char) a); // 将读取到的字节转换为字符并打印
        }




    // 获取输出流，用于向客户端发送响应
        OutputStream os= socket.getOutputStream();
        os.write("已接受信息完毕".getBytes()); // 将响应字符串转换为字节数组并发送


    // 关闭socket和serverSocket，释放资源
        socket.close();
        ss.close();
    }
}
