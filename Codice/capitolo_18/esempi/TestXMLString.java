import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.stream.*;
import org.xml.sax.*;

public class TestXMLString {
    public static void main(String args[]) {
        try {
            String xmlString = getXMLString();
            Document doc = getDocument(xmlString);
            Source source = new DOMSource(doc);
            //Result result = new StreamResult(System.out);
            Result result = new StreamResult(new File("websitesGeneratoDaStringa.xml"));
            Transformer transformer =  TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getXMLString() {
          return 
"""
<websites>
    <website>
        <address>www.nuovojava.it</address>
        <description>Sito di Nuovo Java</description>
    </website>
    <website>
        <address>www.javaforaliens.com</address>
        <description>Java for Aliens Website</description>
    </website>
    <website>
        <address>www.claudiodesio.com</address>
        <description>Personal Website</description>
    </website>
</websites>""";
    }
    
    public static Document getDocument(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        return builder.parse(is);
    }

}