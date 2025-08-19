package stuDemo8_19.myFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileDemo3 {
    public static void main(String[] args) {
         /*
        public long length()                返回文件的大小（字节数量）
        public String getAbsolutePath()     返回文件的绝对路径
        public String getPath()             返回定义文件时使用的路径
        public String getName()             返回文件的名称，带后缀
        public long lastModified()          返回文件的最后修改时间（时间毫秒值）
     */



        //1.length  返回文件的大小（字节数量）
        //细节1：这个方法只能获取文件的大小，单位是字节
        //如果单位我们要是M，G，可以不断的除以1024
        //细节2：这个方法无法获取文件夹的大小
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起。



        File f1=new File("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\main\\java\\stuDemo8_19\\FileDemo\\a.txt");

        // 打印文件的大小（字节数）
        System.out.println(f1.length());

        // 打印文件的绝对路径
        System.out.println(f1.getAbsoluteFile());


        System.out.println(f1.getName());

        // 创建SimpleDateFormat对象，用于格式化时间

        // 将文件的最后修改时间（毫秒值）格式化为指定格式的字符串并打印
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(new Date(f1.lastModified())));

    }
}
