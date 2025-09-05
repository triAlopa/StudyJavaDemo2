package stuDemo9_04.MyIntDemo.E2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientMyRunnable implements Runnable{

    Socket socket;

    public ClientMyRunnable(Socket socket) {
        this.socket = socket;
    }




    @Override
    public void run() {
        while (true){
            //接收服务器发送过来的聊天记录
            try {
                BufferedReader bw=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg = bw.readLine();
                System.out.println(msg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
