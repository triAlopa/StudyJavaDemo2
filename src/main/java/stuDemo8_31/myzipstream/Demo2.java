package stuDemo8_31.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File src=new File("src/a.txt");
        File dest=new File("C:\\Users\\Chen\\Desktop");
        toZip(src,dest);
    }

    private static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        ZipEntry zipEntry=new ZipEntry("a.txt");
        zos.putNextEntry(zipEntry);
        FileInputStream fos=new FileInputStream(src);
        int a=0;
        while ((a=fos.read())!=-1){
            zos.write(a);
        }
        zos.closeEntry();
        zos.close();
    }
}
