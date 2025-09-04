package stuDemo9_04.MyIntDemo.E3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        //接收
        Socket socket = ss.accept();
        //获取输入流
        InputStream is = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);


        //文件创建输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/temp.txt"));

        byte[] bytes = new byte[512];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(1);
            bos.write(bytes, 0, len);
        }
        bis.close();

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

        bw.write("上传成功");
        bw.newLine();
        bw.flush();

//        bw.close();
        socket.close();
        ss.close();
    }
}
