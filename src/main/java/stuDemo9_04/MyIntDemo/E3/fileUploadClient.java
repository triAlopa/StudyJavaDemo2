package stuDemo9_04.MyIntDemo.E3;

import java.io.*;
import java.net.Socket;

public class fileUploadClient {
    /**
     * 主方法，实现文件通过Socket传输到指定服务器
     *
     * @param args 命令行参数
     * @throws IOException 可能抛出IO异常
     */
    public static void main(String[] args) throws IOException {

        //创建链接
        Socket s = new Socket("127.0.0.1", 10086);

        //获取输出流
        OutputStream os = s.getOutputStream();
        //封装为 buffer流输入更快
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //拟定上传文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/a.txt"));

        //读取文件 使用其输入流 并用 链接获取的输出流输出
        int len = 0;
        byte[] bytes = new byte[512];
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
            bos.write(bytes, 0, len);
        }

        s.shutdownOutput();

        //获取链接输入流 ，用来反馈文件上传结果

       BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        String string = br.readLine();
        System.out.println(string);


        s.close();
    }
}
