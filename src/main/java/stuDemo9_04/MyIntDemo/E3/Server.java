package stuDemo9_04.MyIntDemo.E3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {
//        ServerSocket ss = new ServerSocket(10086);
//        //接收
//        Socket socket = ss.accept();
//        //获取输入流
//        InputStream is = socket.getInputStream();
//        BufferedInputStream bis = new BufferedInputStream(is);
//
//
//        //文件创建输出流
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/temp.txt"));
//
//        byte[] bytes = new byte[512];
//        int len = 0;
//        while ((len = bis.read(bytes)) != -1) {
//            System.out.println(1);
//            bos.write(bytes, 0, len);
//        }
//        bos.close();
//
//        OutputStream os = socket.getOutputStream();
//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
//
//        bw.write("上传成功");
//        bw.newLine();
//        bw.flush();
//
////        bw.close();
//        socket.close();
//        ss.close();

        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10086);

        //2.等待客户端来连接
        Socket socket = ss.accept();

        //3.读取数据并保存到本地文件中
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/temp.txt"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        //4.回写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        //5.释放资源
        socket.close();
        ss.close();
    }
}
