package stuDemo9_03.ipDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class myIp {
/**
 * 主方法，演示了InetAddress类的使用
 * 通过主机名获取IP地址信息，并输出主机名和IP地址
 *
 * @param args 命令行参数
 * @throws UnknownHostException 当无法解析主机名时抛出此异常
 */
    public static void main(String[] args) throws UnknownHostException {
        // 通过主机名获取InetAddress对象
        InetAddress address = InetAddress.getByName("DESKTOP-GR78KPD");//DESKTOP-GR78KPD/192.168.0.120
        // 输出InetAddress对象的信息
        System.out.println(address);


        // 获取并输出主机名
        String name = address.getHostName();//DESKTOP-GR78KPD
        System.out.println(name);

        // 获取并输出主机IP地址
        String hostAddress = address.getHostAddress();//192.168.0.120
        System.out.println(hostAddress);
    }
}
