package stuDemo8_19.myFile.E;

import java.io.File;
import java.io.IOException;

public class E1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\main\\java\\stuDemo8_19\\FileDemo");
        System.out.println(f1.mkdir());//true

        File f2=new File("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\main\\java\\stuDemo8_19\\FileDemo\\aa.txt");
        System.out.println(f2.createNewFile());//true
    }
}
