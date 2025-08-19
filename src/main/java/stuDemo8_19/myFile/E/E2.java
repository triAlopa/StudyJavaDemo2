package stuDemo8_19.myFile.E;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class E2 {
    public static void main(String[] args) {

        findFile(new File("C:\\Users\\Chen\\Desktop\\新建文件夹"));
    }
/**
 * 查找指定目录下的所有.avi视频文件
 * @param file 要搜索的目录文件对象
 */
    public static void findFile(File file){
        if(!file.isDirectory()) return;  // 判断传入的文件对象是否为目录，如果不是则直接返回
         // 使用list方法配合FilenameFilter接口来过滤文件
        String[] list = file.list(new FilenameFilter() {
            /**
             * 实现FilenameFilter接口的accept方法，用于判断文件是否满足条件
             * @param dir 当前被搜索的目录
             * @param name 文件或目录的名称
             * @return 如果是.avi文件则返回true，否则返回false
             */
            @Override
            public boolean accept(File dir, String name) {
                // 创建文件对象
                File file1 = new File(dir, name);
                // 判断是否是文件且以.avi结尾
                if (file1.isFile() && name.endsWith(".avi")) {
                    System.out.println(file1);
                    return true;
                }  // 检查文件是否为.avi格式
                if(file1.isDirectory()) findFile(file1);
                return false;  // 如果不是.avi文件则返回false
            }
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
