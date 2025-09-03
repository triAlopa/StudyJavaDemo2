package stuDemo9_03.udpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class receiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //从 10086端口绑定从而接收数据
        DatagramSocket ds = new DatagramSocket(10086);

        //接收数据 所用变量
        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接收是阻塞的 程序等待发送端发送数据
        ds.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println(address + "设备号使用了" + port + "发送了" + new String(data, 0, length));


        ds.close();

    }
}
