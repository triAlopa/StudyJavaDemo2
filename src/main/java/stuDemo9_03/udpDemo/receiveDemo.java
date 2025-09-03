package stuDemo9_03.udpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class receiveDemo {
    public static void main(String[] args) throws IOException {
        //包装接收端对象
        DatagramSocket ds= new DatagramSocket(10001);
        //接收数据
        byte[] bytes=new byte[1024*5];
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);
        while (true){
            System.out.println("等待消息ing......");
            ds.receive(dp);
            byte[] data = dp.getData();
            System.out.println(dp.getAddress()+"机主在"+dp.getPort()+"端口发送了"+new String(data,0,dp.getLength()));
        }
    }
}
