package stuDemo9_03.udpDemo.Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class receiveDemo2 {
/**
 * 使用多播套接字接收多播消息的主方法
 * @param args 命令行参数（未使用）
 * @throws IOException 如果发生I/O错误
 */
    public static void main(String[] args) throws IOException {
    // 创建一个绑定到10000端口的多播套接字
        MulticastSocket ms=new MulticastSocket(10000);
    // 加入多播组224.1.0.1，加入该组后可以接收发送到此多播地址的数据包
        ms.joinGroup(InetAddress.getByName("224.1.0.1"));

    // 创建一个5KB的字节数组，用于接收数据
        byte[] bytes=new byte[1024*5];

    // 创建一个DatagramPacket对象，用于接收数据包
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);


    // 阻塞式接收多播数据包，直到有数据到达
        ms.receive(dp);

    // 从数据包中获取接收到的数据
        byte[] data = dp.getData();
    // 将接收到的字节数组转换为字符串并输出（只输出有效长度的部分）
        System.out.println(new String(data,0,dp.getLength()));
    }
}
