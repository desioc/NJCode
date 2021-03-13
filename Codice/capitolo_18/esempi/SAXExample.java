import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class SAXExample {
    public static void main(String[] args) {
        DefaultHandler myHandler = new MyHandler();
        try {
            SAXParserFactory factory =
            SAXParserFactory.newInstance();
            factory.setValidating(false);
            factory.newSAXParser().parse(new File("eje.xml"), myHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class MyHandler extends DefaultHandler {
        public void startDocument() {
            System.out.println("---Inizio parsing---");
        }
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            System.out.println("<"+qName+ ">");
        }
        public void endElement(String uri, String localName, String qName) {
            System.out.println("</"+ qName+ ">");
        }
        public void endDocument() {
            System.out.println("---Fine parsing---");
        }
    }
}