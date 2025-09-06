package stuDemo9_06ClassLoad;

import cn.hutool.core.text.split.SplitIter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class classLoad {
/**
 * 主方法，演示Java类加载器加载属性文件的过程
 * @param args 命令行参数
 * @throws IOException 如果发生I/O错误
 */
    public static void main(String[] args) throws IOException {
        //获取系统类加载器（也称为应用程序类加载器）
        // 它负责加载应用程序classpath上指定的类库
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();

        //获取平台类加载器（Java 9引入）
        // 在Java 9之前，这行代码会获取扩展类加载器
        // 平台类加载器负责加载JDK模块的API
//        ClassLoader classLoader2 = classLoader1.getParent();
//
//        //获取启动类加载器
//        ClassLoader classLoader3 = classLoader2.getParent();
//
//        System.out.println(classLoader1);//jdk.internal.loader.ClassLoaders$AppClassLoader@4617c264
//        System.out.println(classLoader2);//jdk.internal.loader.ClassLoaders$AppClassLoader@4617c264
//        System.out.println(classLoader3);//null

        InputStream is = classLoader1.getResourceAsStream("pro.properties");

        Properties pro=new Properties();
        pro.load(is);

        System.out.println(pro);
        is.close();
    }
}
