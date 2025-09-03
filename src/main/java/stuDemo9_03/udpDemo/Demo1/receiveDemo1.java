package stuDemo9_03.udpDemo.Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class receiveDemo1 {
/**
 * 主方法，用于接收多播数据
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建一个多播套接字，绑定到10000端口
        MulticastSocket ms=new MulticastSocket(10000);
    // 加入多播组，组地址为224.1.0.1
        ms.joinGroup(InetAddress.getByName("224.1.0.1"));

    // 创建一个5KB的字节数组，用于接收数据
        byte[] bytes=new byte[1024*5];

    // 创建一个DatagramPacket对象，用于接收数据报
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);


    // 阻塞式接收数据报，直到接收到数据
        ms.receive(dp);

    // 获取接收到的数据
        byte[] data = dp.getData();
    // 将接收到的字节数组转换为字符串并输出，只输出有效长度的数据
        System.out.println(new String(data,0,dp.getLength()));

    }
}
