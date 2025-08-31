package stuDemo8_31.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo4 {
/**
 * 主方法：将指定文件夹压缩成zip文件
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建源文件夹对象，路径为"C:\Users\Chen\Desktop\新建文件夹"
        File src=new File("C:\\Users\\Chen\\Desktop\\新建文件夹");
    // 创建目标zip文件对象，位于源文件夹的父目录中，文件名为源文件夹名加上.zip后缀
        File dest=new File(src.getParent(),src.getName()+".zip");

    // 创建ZipOutputStream对象，用于将数据写入到zip文件中
        ZipOutputStream zou=new ZipOutputStream(new FileOutputStream(dest));

    // 调用toZip方法，将源文件夹内容压缩到zip文件中
    // 参数：源文件夹、ZipOutputStream对象、源文件夹名称（作为zip文件中的根目录）
        toZip(src,zou,src.getName());
    // 关闭ZipOutputStream，释放资源
        zou.close();
    }

/**
 * 将文件或文件夹压缩为ZIP格式
 * @param src 要压缩的源文件或文件夹
 * @param zou ZIP输出流
 * @param name 在ZIP文件中的路径名称
 * @throws IOException 如果发生I/O错误
 */
    private static void toZip(File src, ZipOutputStream zou, String name) throws IOException {
    // 获取源文件下的所有文件和文件夹
        File[] files = src.listFiles();
    // 遍历所有文件和文件夹
        for (File file : files) {
        // 如果是文件
            if(file.isFile()){
            // 创建ZIP条目，包含在ZIP中的路径和文件名
                ZipEntry zipEntry=new ZipEntry(name+"\\"+file.getName());
            // 将ZIP条目写入ZIP输出流
                zou.putNextEntry(zipEntry);

            // 创建文件输入流
                FileInputStream fis=new FileInputStream(file);
                int a=0;
            // 读取文件内容并写入ZIP输出流
                while ((a=fis.read())!=-1){
                    zou.write(a);
                }
            // 关闭当前ZIP条目
                zou.closeEntry();
            // 关闭文件输入流
                fis.close();
            }else {
            // 如果是文件夹，则递归调用toZip方法处理子文件夹
                toZip(file,zou,name+"\\"+file.getName());
            }

        }

    }
}
