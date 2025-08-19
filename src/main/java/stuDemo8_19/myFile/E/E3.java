package stuDemo8_19.myFile.E;

import java.io.File;

public class E3 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Chen\\Desktop\\新建文件夹\\新建文件夹 (3) - 副本");
        delFile(f1);
    }

    public static void delFile(File file) {
        if(file.isFile()) {
            System.out.println(file.delete());
            return;
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println(file1.delete());
            } else {
                delFile(file1);
            }
        }
        System.out.println(file.delete());

    }
}
