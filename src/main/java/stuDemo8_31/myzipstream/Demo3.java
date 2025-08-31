package stuDemo8_31.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo3 {

    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\Chen\\Desktop\\新建文件夹");
        File dest = new File(src.getParent(),src.getName()+".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src, zos, src.getName());

        zos.close();

    }

    private static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry zipEntry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(zipEntry);

                FileInputStream fis = new FileInputStream(file);
                int a = 0;
                while ((a = fis.read()) != -1) {
                    zos.write(a);
                }
                zos.closeEntry();
                fis.close();
            } else {
                toZip(file, zos, name + "\\" +file.getName());
            }
        }

    }
}
