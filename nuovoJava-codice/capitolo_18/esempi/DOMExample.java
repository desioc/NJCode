import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class DOMExample {
    public static void main(String[] args) {
        Document doc = parseXmlFile("eje.xml", false);
        NodeList list = doc.getElementsByTagName("*");
        for (int i=0; i<list.getLength(); i++) {
            Element element = (Element)list.item(i);
            if (element.getNodeType() == Node.TEXT_NODE) {
                System.out.println(element.getTextContent());
            }
            else {
                System.out.println(element.getNodeName());
            }
        }
    }
  
    public static Document parseXmlFile(String filename, boolean validating) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(validating);
            Document doc = factory.newDocumentBuilder().parse(new  File(filename));
            return doc;
        } catch (SAXException |  ParserConfigurationException | IOException e) {
            e.printStackTrace();
        } 
        return null;
    }
}