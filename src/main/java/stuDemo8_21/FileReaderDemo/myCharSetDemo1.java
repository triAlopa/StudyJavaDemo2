package stuDemo8_21.FileReaderDemo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class myCharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
       Java中编码的方法
            public byte[] getBytes()                        使用默认方式进行编码
            public byte[] getBytes(String charsetName)      使用指定方式进行编码

        Java中解码的方法
            String(byte[] bytes)                            使用默认方式进行解码
            String(byte[] bytes, String charsetName)        使用指定方式进行解码
        */
        String str="学Java好累";
        byte[] bytes = str.getBytes();

//        for (byte b : bytes) {
//            System.out.println(b);
//        }
        System.out.println(new String(bytes));


        System.out.println("---------------------");

        byte[] bytes1 = str.getBytes(StandardCharsets.US_ASCII);

//        for (byte b : bytes1) {
//            System.out.println(b);
//        }
        System.out.println(new String(bytes1));
    }
}
