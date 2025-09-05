package stuDemo9_04.MyIntDemo.E2;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

public class MyRunnable implements Runnable {

    Socket socket;
    Properties pro;

    public MyRunnable(Socket socket, Properties pro) {
        this.socket = socket;
        this.pro =pro;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                String choose = br.readLine();
                switch (choose){
                    case "login"-> login(br);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void login(BufferedReader br) throws IOException {
        System.out.println("用户选择了登录操作");
        String userinfo = br.readLine();
        String[] userInfoArr = userinfo.split("&");
        String name = userInfoArr[0].split("=")[1];

        if(pro.containsKey(name)){
            String rightPassword = pro.get(name) + "";
            String password = userInfoArr[1].split("=")[1];
            if(password.equals(rightPassword)){
                System.out.println(password+"-------"+rightPassword);
                //提示用户登录成功，可以开始聊天
                writeMessage2Client("1");
                //登录成功的时候，就需要把客户端的连接对象Socket保存起来
                server.list.add(socket);
                //
                //写一个while(){}表示正在聊天
                //接收客户端发送过来的消息，并打印在控制台
                talk2All(br, name);
            }else {
                writeMessage2Client("2");
            }
        }else {
            writeMessage2Client("3");
        }

    }

    private void talk2All(BufferedReader br,String name) throws IOException {
        while (true){
            String msg = br.readLine();
            System.out.println(name+"发来消息"+msg);

            for (Socket socket : server.list) {
                writeMessage2Client(socket,name+"发来消息"+msg);
            }
        }
    }

    private void writeMessage2Client(Socket socket, String s) throws IOException {
        BufferedWriter  bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(s);
        bw.newLine();
        bw.flush();
    }

    private void writeMessage2Client(String message) throws IOException {
        BufferedWriter  bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();

    }


//    @Override
//    public void run() {
//        //循环 该进程
//        while (true) {
//            InputStream is = null;
//            try {
//                //获取 客服端输入流
//                is = socket.getInputStream();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            //包装 加快读取
//            BufferedInputStream bis = new BufferedInputStream(is);
//            byte[] bytes = new byte[512];
//            int len;
//            String str = "";
//            while (true) {
//                try {
//                    if ((len = bis.read(bytes)) == -1) break;
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                //获取并打印
//                str = new String(bytes, 0, len);
////                System.out.println(str);
//            }
//            //服务器端 获取文件 ，用来读取用户配置文件
//            BufferedReader br = null;
//            try {
//                br = new BufferedReader(new FileReader("src/main/java/stuDemo9_04/MyIntDemo/E2/userConfig.txt"));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//
//            //获取文件的其中用户信息的每一行
//            String string = null;
//            //获取服务器的输出流 、用来反馈结果
//            OutputStream os;
//            try {
//                 os = socket.getOutputStream();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            while (true) {
//                try {
//                    //读取结束跳出循环
//                    if ((string = br.readLine()) == null) break;
//                    else {
//                        String[] split = string.split("&");
//                        String nameCig=split[0];
//                        String passwordCig=split[1];
//                        System.out.println(str);
//                        System.out.println(str.split("&")[0]);
//                        System.out.println(str.split("&")[1]);
//                        String name = str.split("&")[0].split("=")[1];
//                        String password = str.split("&")[1].split("=")[1];
//                        if(nameCig.equals(name)){
//                            if(passwordCig.equals(password)){
//                                os.write("200".getBytes());
//                                System.out.println("--------");
//                                break;
//                            }else {
//                                os.write("密码错误！".getBytes());
//                                break;
//                            }
//                        }
//                        os.write("不存在该账号".getBytes());
//                        break;
//                    }
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//        }
//    }
}
