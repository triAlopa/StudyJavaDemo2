package stuDemo9_03.udpDemo.Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class sendDemo {
/**
 * 主方法，演示使用多播套接字发送消息
 * @param args 命令行参数
 * @throws IOException 如果发生I/O错误
 */
    public static void main(String[] args) throws IOException {

    // 创建一个多播套接字
        MulticastSocket ms=new MulticastSocket();

    // 准备要发送的消息
        String str="hello";
    // 将字符串转换为字节数组
        byte[] bytes = str.getBytes();
    // 获取多播地址
        InetAddress address = InetAddress.getByName("224.1.0.1");

    // 创建数据报包，包含消息内容、长度、目标地址和端口
        DatagramPacket dp=new DatagramPacket(bytes, 0,bytes.length,address,10000);


    // 发送数据报包
        ms.send(dp);

    // 关闭多播套接字
        ms.close();

    }
}
