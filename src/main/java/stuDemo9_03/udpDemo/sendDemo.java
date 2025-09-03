package stuDemo9_03.udpDemo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class sendDemo {
    public static void main(String[] args) throws IOException {
        //包装发送端
        DatagramSocket ds = new DatagramSocket();
        //
        Scanner sc = new Scanner(System.in);
        InetAddress address = InetAddress.getByName("127.0.0.1");
        while (true) {
            String line = sc.nextLine();
            if ("886".equals(line)) break;
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, address, 10001);
            ds.send(dp);
        }
        ds.close();
    }
}
