package stuDemo8_21.FileStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    /**
     * 主方法，演示文件写入操作
     *
     * @param args 命令行参数
     * @throws IOException 可能抛出IO异常
     */
    public static void main(String[] args) throws IOException {

        // 创建文件输出流，以追加模式打开文件
        //如果想要续写 ，则打开append为true //默认会覆盖
        //数据是以ASCII码表 写入的
        //写入 完毕后 必须关闭资源
        //如果父级列表不存在 则会报错 FileNotFoundException错误
        //子级文件不存在 ，父级文件夹存在，则会创建文件
        FileOutputStream f = new FileOutputStream(new File("src\\a.txt"), true);

        // 向文件写入一个字节（字符'c'的ASCII码）
        f.write(99);

        // 向文件写入换行符
        f.write("\r\n".getBytes());

        // 定义一个字符串并转换为字节数组，然后写入文件
        String test1 = "chen test";
        byte[] bytes1 = test1.getBytes();
        f.write(bytes1);

        // 再次写入换行符
        f.write("\r\n".getBytes());

        // 定义另一个字符串，转换为字节数组，并只写入前3个字节
        String test2 = "hua test";
        byte[] bytes2 = test2.getBytes();
        f.write(bytes2, 0, 3);
    }
}
