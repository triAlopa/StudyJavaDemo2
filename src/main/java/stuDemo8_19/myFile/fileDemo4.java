package stuDemo8_19.myFile;

import java.io.File;
import java.io.IOException;

public class fileDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        public boolean createNewFile()      创建一个新的空的文件
        public boolean mkdir()              创建单级文件夹
        public boolean mkdirs()             创建多级文件夹
        public boolean delete()             删除文件、空文件夹
      */

        //C:\Users\Chen\Desktop\Record
        //只能创建 文件
        //如果当前文件存在 创建失败 返回false
        //父级路径存在 文件不存在，创建成功，返回true
        //如果当前父级路径不存在 则抛出IOE异常
        File f1=new File("C:\\Users\\Chen\\Desktop\\Record");  // 创建File对象f1，指向指定路径
        System.out.println(f1.createNewFile());  // 调用createNewFile()方法创建文件，并打印结果

        //只能创建 单级文件夹
        //如果多级 创建失败
        File f2 =new File("C:\\Users\\Chen\\Desktop\\ddd");  // 创建File对象f2，指向指定路径
        System.out.println(f2.mkdir());  // 调用mkdir()方法创建单级文件夹，并打印结果


        //创建多级文件夹 也可以创建一级文件夹
        File f3 =new File("C:\\Users\\Chen\\Desktop\\ddd\\aaa\\aaa");  // 创建File对象f3，指向多级路径
        System.out.println(f3.mkdirs());  // 调用mkdirs()方法创建多级文件夹，并打印结果
    }
}
