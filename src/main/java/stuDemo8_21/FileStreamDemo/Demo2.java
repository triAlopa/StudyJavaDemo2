package stuDemo8_21.FileStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
/**
 * 主方法：演示使用FileInputStream读取文件内容
 * 通过字节流方式逐个读取文件中的字符并打印
 *
 * @throws IOException 当文件不存在或发生I/O错误时抛出
 */
    public static void main(String[] args) throws IOException {
        //文件不存在 直接报错 ，不同于输出 ，读取数据 从文件里拿，文件不存在 即使创建一个新的文件也是空的，没有读取的必要
        //read方法只能读取一个 读到末端就会返回-1
        FileInputStream fis=new FileInputStream(new File("src\\a.txt"));
//        byte[] bytes = fis.readAllBytes();
//        for (byte b : bytes) {
//            System.out.println(b);
//        }

        while (true){
            int read = fis.read();
            if(read==-1) break;
            System.out.println((char) read);
        }

        fis.close();
    }
}
