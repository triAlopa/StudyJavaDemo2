package stuDemo8_31.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
            unzip(new File("C:\\Users\\Chen\\Desktop\\新建文件夹.zip"),new File("C:\\Users\\Chen\\Desktop\\新建文件夹"));
    }

    public static void unzip(File src, File desc) throws IOException {

        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;



        while ((entry = zip.getNextEntry()) != null) {

            if (entry.isDirectory()) {
                File file = new File(desc, entry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(desc,entry.toString()));
                int a=0;

                while ((a=zip.read())!=-1){
                    fos.write(a);
                }
                fos.close();
            }
        }
        zip.closeEntry();
        zip.close();
    }
}
