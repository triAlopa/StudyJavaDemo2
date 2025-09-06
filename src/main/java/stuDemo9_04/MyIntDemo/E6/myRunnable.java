package stuDemo9_04.MyIntDemo.E6;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class myRunnable implements Runnable{
    Socket s;
    public myRunnable(Socket socket){
        this.s=socket;
    }

    @Override
    public void run() {
        try {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(s!=null) {
                try {
                    s.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
