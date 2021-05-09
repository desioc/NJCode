import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.stream.*;


public class XSLTExample {
    public static void main(String args[]) throws Exception {
        File xmlFile = new File("websites.xml");
        DocumentBuilderFactory factory  = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(xmlFile);
        File styleSheet = new File("websites.xsl");
        StreamSource styleSheetSource = new StreamSource(styleSheet);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer(styleSheetSource);
        Source source = new DOMSource(document);
        //Result result = new StreamResult(System.out);
        Result result = new StreamResult(new File("websites.html"));
        transformer.transform(source, result);
    }
}