package stuDemo9_01.myIOe;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
         制造假数据：
             获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
             获取男生名字：http://www.haoming8.cn/baobao/10881.html
             获取女生名字：http://www.haoming8.cn/baobao/7641.html
        */
public class E1 {
/**
 * 主方法：用于从网络爬取百家姓和男孩女孩名字数据，并进行处理
 * @param args 命令行参数
 * @throws IOException 可能抛出的IO异常
 */
    public static void main(String[] args) throws IOException {
    // 定义百家姓网页URL
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
    // 定义男孩名字网页URL
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
    // 定义女孩名字网页URL
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //临时处理数据：爬取百家姓网页内容并提取百家姓
        String familyNameStr = webCrawler(familyNameNet);
        ArrayList<String> familyTempList = getData(familyNameStr, "([\\u4e00-\\u9fa5]{4})(，|。)",1);

        //临时处理数据：爬取男孩名字网页内容并提取男孩名字
        String boyNameStr = webCrawler(boyNameNet);
        ArrayList<String> boyTempList = getData(boyNameStr, "([\\u4e00-\\u9fa5]{2})(、|。)",1);

        //临时处理数据：爬取女孩名字网页内容并提取女孩名字
        String girlNameStr = webCrawler(girlNameNet);
        ArrayList<String> girlTempList = getData(girlNameStr, "(.. ){4}(..)",0);

        //处理百家姓数据：将每个姓氏拆分为单个字符并添加到列表中
        ArrayList<String> familyList=new ArrayList<>();
        for (String str : familyTempList) {
            for (int i = 0; i < str.length(); i++) {
                familyList.add(str.charAt(i) + "");
            }
        }

        //处理男孩名字数据：去重处理
        ArrayList<String> boyList=new ArrayList<>();
        for (String str : boyTempList) {
            if(!boyList.contains(str)){
                boyList.add(str);
            }
        }

        //处理女孩名字数据：分割字符串并添加到列表中
        ArrayList<String> girlList=new ArrayList<>();
        for (String str : girlTempList) {
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlList.add(arr[i]);
            }
        }

    }

    private static ArrayList<String> getData(String nameStr, String regex, int index) {
        //1.创建 数组列表保存数据返回
        ArrayList<String> list=new ArrayList<>();
        //2.创建 表达式规则的容器，并处理数据；
        Pattern pattern = Pattern.compile(regex);    // 编译正则表达式，创建模式对象
        Matcher matcher = pattern.matcher(nameStr);   // 创建匹配器，用于在输入字符串中查找匹配项

        //3.爬取添加
        while (matcher.find()){                     // 循环查找所有匹配项
            list.add(matcher.group(index));          // 将匹配到的指定组索引的内容添加到列表中
        }
        return list;                                // 返回包含所有匹配结果的列表
    }


    /**
     * 网页爬虫方法，用于获取指定URL的网页内容
     *
     * @param net 要爬取的网页URL地址
     * @return 返回爬取到的网页内容字符串
     * @throws IOException 如果发生I/O错误时抛出
     */
    private static String webCrawler(String net) throws IOException {
        //1.创建添加数据容器 - 使用StringBuilder来高效拼接字符串
        StringBuilder sb = new StringBuilder();
        //2.创建链接网址 - 将字符串URL转换为URL对象
        URL url = new URL(net);
        //3.链接 - 打开与URL的连接
        URLConnection urlConnection = url.openConnection();
        //4.获取字节输入流 - 从连接中获取输入流，用于读取数据
        InputStream inputStream = urlConnection.getInputStream();
        //5.爬取中文转换流为字符输入流 - 使用InputStreamReader将字节流转换为字符流，确保正确读取中文
        InputStreamReader isr = new InputStreamReader(inputStream);
        int ch = 0;

        //循环读取流中的每个字符，直到读取到末尾(-1)
        while ((ch = isr.read()) != -1) {
            //将读取到的字符添加到StringBuilder中
            sb.append((char) ch);
        }
        //将StringBuilder转换为字符串并返回
        return sb.toString();
    }
}
