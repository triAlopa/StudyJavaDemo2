package stuDemo9_04.tcpDemp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10086);

        OutputStream os = s.getOutputStream();
//        OutputStreamWriter osw=new OutputStreamWriter(os);


        os.write("你好".getBytes());



       os.close();
        s.close();
    }
}
