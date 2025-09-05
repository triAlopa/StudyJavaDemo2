package stuDemo9_04.MyIntDemo.E4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
/**
 * Java Socket编程示例
 * 实现客户端向服务器发送数据并接收响应
 */
    public static void main(String[] args) throws IOException {  // 主方法，抛出IO异常
    // 创建Socket对象，指定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 10086);  // 创建Socket连接到本地服务器的10086端口

    // 获取输出流，用于向服务器发送数据
        OutputStream os = socket.getOutputStream();  // 获取Socket的输出流

    // 将字符串转换为字节数组并发送
        os.write("开始发送数据".getBytes());  // 将字符串转换为字节数组并发送给服务器

    // 以下代码被注释，因为后面会重新创建InputStreamReader
//        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        //结束标记 输出结束
        socket.shutdownOutput();  // 关闭输出流，表示发送数据结束

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());  // 创建输入流读取器，用于读取服务器响应

        int a = 0;  // 定义整型变量a，用于存储读取的字节
        while ((a = isr.read()) != -1) {  // 循环读取服务器响应，直到读取到-1（流结束）
            System.out.print((char) a);  // 将读取到的字节转换为字符并打印
        }


        socket.close();  // 关闭Socket连接，释放资源


    }
}
