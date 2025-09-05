package stuDemo9_04.MyIntDemo.E5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10087);

        Socket s = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        String fileName = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/" + fileName + ".png"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write("上传成功！");
        bw.flush();
        bw.close();

        s.close();
        ss.close();

    }
}
