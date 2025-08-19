package stuDemo8_19.myFile.E;

import java.io.File;

public class E5 {
    public static void main(String[] args) {
        System.out.println(getLen(new File("D:\\epic游戏"))/1024/1024);
    }

    public static long getLen(File file){
        if(file.exists()) return 0l;
        long len=0;
        if(file.isFile()) return file.length();
        if(file.isDirectory()){
            File[] listFiles = file.listFiles();

            for (File f : listFiles) {
                if(f.isFile()) len=len+f.length();
                else      len+= getLen(f);
            }
        }

        return len;
    }
}
