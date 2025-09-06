package stuDemo9_06XmlDemo.E3;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class dom4j {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read(new File("src/main/java/stuDemo9_06XmlDemo/E3/user.xml"));

        //检索 绝对路径
//        List<Element> list = document.selectNodes("/users/user/userName");
//        for (Element element : list) {
//            System.out.println(element.getText());
//        }


        // 相对路径
//        Element rootElement = document.getRootElement();
//        List<Element> list = rootElement.selectNodes("./user/userName");
//        for (Element element : list) {
//            System.out.println(element.getText());
//        }
        //全文检索
//        List<Element> list = document.selectNodes("//userName");
//        List<Element> list = document.selectNodes("//user/userName");
//        List<Element> list = document.selectNodes("//users//userName");
//        for (Element element : list) {
//            System.out.println(element.getText());
//        }

        //属性检索
//        List<Attribute> list = document.selectNodes("//@id");
//        for (Attribute a : list) {
//            System.out.println(a.getText());
//        }
        List<Element> list = document.selectNodes("//user[@id]");
        for (Element e : list) {
            System.out.println(e.getText());//输出 该标签 《user》文本内容
        }
    }
}
