import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.stream.*;


public class XSLTDisplayDocumentExample {
    public static void main(String args[]) {
        try {
            Document doc = DOMExample.parseXmlFile("websites.xml", false);
            Source source = new DOMSource(doc);
            File file = new File("websites-bkp.xml");
            Result result = new StreamResult(file);
           // Result result = new StreamResult(System.out);
            Transformer transformer =  TransformerFactory.newInstance().newTransformer();
//            transformer.setOutputProperty(OutputKeys.METHOD, "text");
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}