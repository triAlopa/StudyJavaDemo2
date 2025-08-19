package stuDemo8_19.myFile;

import java.io.File;


public class fileDemo2 {
    public static void main(String[] args) {
        /*
        public boolean isDirectory()        判断此路径名表示的File是否为文件夹
        public boolean isFile()             判断此路径名表示的File是否为文件
        public boolean exists()             判断此路径名表示的File是否存在
         */

        File f1=new File("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\main\\java\\stuDemo8_19\\FileDemo\\a.txt");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.lastModified());


    }
}
