package stuDemo9_04.tcpDemp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);

        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        int b=0;

        InputStreamReader isr = new InputStreamReader(is);

        while ((b=isr.read())!=-1){
            System.out.print((char) b);
        }

        is.close();
        isr.close();
        accept.close();
        ss.close();
    }
}
