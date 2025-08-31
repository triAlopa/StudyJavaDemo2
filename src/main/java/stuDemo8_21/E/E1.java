package stuDemo8_21.E;

import java.io.*;

public class E1 {
/**
 * 主方法，用于程序的入口点
 * @param args 命令行参数
 * @throws IOException 可能抛出的IO异常
 */
    public static void main(String[] args) throws IOException {
        // 创建源文件对象，指向"D:\\app\\Apipost"路径
        File re = new File("D:\\app\\Apipost");
        // 创建目标文件对象，指向"C:\\Users\\Chen\\Desktop\\新建文件夹"路径
        File wi = new File("C:\\Users\\Chen\\Desktop\\新建文件夹");
        // 调用copyFile方法，将源文件内容复制到目标位置
        copyFile(re, wi);
    }

/**
 * 复制文件或文件夹的方法
 * @param readFile 要复制的源文件或文件夹
 * @param outFile 目标文件或文件夹
 * @throws IOException 可能出现的IO异常
 */
    public static void copyFile(File readFile, File outFile) throws IOException {
    // 注释掉的代码：创建文件输入流和输出流
//        FileInputStream fis = new FileInputStream(readFile);
//        FileOutputStream fos = new FileOutputStream(outFile);

    // 获取源文件或文件夹下的所有文件和子文件夹
        File[] files = readFile.listFiles();

    // 遍历每个文件和文件夹
        for (File file : files) {
        // 如果是文件
            if (file.isFile()) {
            // 创建目标文件的输出流
                FileOutputStream fos = new FileOutputStream(new File(outFile,file.getName()));
            // 创建5MB的缓冲区
                byte[] bytes = new byte[1024 * 1024 * 5];
            // 创建源文件的输入流
                FileInputStream fis = new FileInputStream(file);
                int read = 0;
            // 循环读取文件内容并写入目标文件
                while ((read=fis.read(bytes))!=-1){
                     fos.write(bytes,0,read);
                }
            // 关闭输出流
                fos.close();
            // 关闭输入流
                fis.close();
            }else if(file.isDirectory()) { // 如果是文件夹
                File tempFile = new File(outFile, file.getName());
                tempFile.mkdirs(); // 创建目标文件夹
                copyFile(file,tempFile); // 递归调用复制文件夹内容
            }
        }
    }
}
