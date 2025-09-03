package stuDemo9_03.udpDemo;

import java.io.IOException;
import java.net.*;

public class sendMessageDemo {
    public static void main(String[] args) throws IOException {

        //发送载体
        DatagramSocket ds=new DatagramSocket();
        //绑定数据
        String str="hello";
        byte[] bytes = str.getBytes();
        InetAddress address=InetAddress.getByName("127.0.0.1");
        int port=10086;

        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,address,port);

        //发送数据
        ds.send(dp);

        //关流
        ds.close();
    }
}
