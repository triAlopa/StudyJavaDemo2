package stuDemo9_04.MyIntDemo.E5;

import java.io.*;
import java.net.Socket;

public class fileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("127.0.0.1",10087);

        OutputStream os = s.getOutputStream();

        BufferedOutputStream bos=new BufferedOutputStream(os);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/img.png"));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();

        s.shutdownOutput();

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String string = br.readLine();
        System.out.println(string);

        br.close();
        s.close();
    }
}
