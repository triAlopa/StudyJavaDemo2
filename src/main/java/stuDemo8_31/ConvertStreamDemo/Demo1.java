package stuDemo8_31.ConvertStreamDemo;

import java.io.*;
import java.nio.charset.Charset;

public class Demo1 {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("src/gbkfile.txt"), Charset.forName("GBK"));

        FileReader fr=new FileReader("src/gbkfile.txt",Charset.forName("GBK"));

//        int a=0;
//        while ((a= isr.read())!=-1){
//            System.out.print( (char) a);
//        }
//        isr.close();

        int a=0;
        while ((a= fr.read())!=-1){
            System.out.print( (char) a);
        }
        fr.close();
    }
}
