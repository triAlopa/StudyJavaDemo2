package stuDemo9_06XmlDemo.E2;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class dom4j {
    public static void main(String[] args) throws DocumentException {
        SAXReader sax=new SAXReader();
        Document document = sax.read(new File("src/main/java/stuDemo9_06XmlDemo/E2/user.xml"));

        Element rootElement = document.getRootElement();

        System.out.println(rootElement);

        List<Element> elements = rootElement.elements();

        for (Element e : elements) {
            Attribute id = e.attribute("id");
            String valueid = id.getText();
            String userName = e.element("userName").getText();
            String password = e.element("password").getText();
            String flag = e.element("flag").getText();
            String phone = e.element("phone").getText();
            user u=new user(valueid,userName,password,phone,Boolean.parseBoolean(flag));
            System.out.println(u);
        }
    }
}
