package stuDemo9_06XmlDemo.E1;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/main/java/stuDemo9_06XmlDemo/E1/students.xml"));

        //获取根节点
        Element rootElement = document.getRootElement();
        //获取根标签 里的标签  我只需要student
        List<Element> elements = rootElement.elements("student");
        for (Element element : elements) {
            Attribute id = element.attribute("id");
            String valueId = id.getText();
            String valueName = element.element("name").getText();
            String valueAge = element.element("age").getText();
            System.out.println(valueId+", "+valueName+",  "+valueAge);
        }
    }
}
