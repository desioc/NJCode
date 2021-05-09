
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StAXExampleReader {

    // dichiariamo costanti di utilità
    private static final String EMAIL = "email";
    private static final String FROM = "from";
    private static final String RECIPIENTS = "recipients";
    private static final String SUBJECT = "subject";
    private static final String BODY = "body";

    public List<EMail> leggiFileXML(String xmlFile) {
        List<EMail> eMails = new ArrayList<>();
        try {
            //creaiamo un XMLInputFactory...
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // ...e poi un XMLEventReader
            InputStream in = new FileInputStream(xmlFile);
            XMLEventReader xmlEventReader = inputFactory.createXMLEventReader(in);
            EMail eMail = null;
            // leggiamo il file xml
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    String localPart = startElement.getName().getLocalPart();
                    // se abbiamo letto un tag 'email' creiamo un oggetto EMail
                    switch (localPart) {
                        case EMAIL:
                            eMail = new EMail();
                            break;
                        case FROM:
                            xmlEvent = xmlEventReader.nextEvent();
                            eMail.setFrom(xmlEvent.asCharacters().getData());
                            break;
                        case RECIPIENTS:
                            xmlEvent = xmlEventReader.nextEvent();
                            eMail.setRecipients(xmlEvent.asCharacters().getData());
                            break;
                        case SUBJECT:
                            xmlEvent = xmlEventReader.nextEvent();
                            eMail.setSubject(xmlEvent.asCharacters().getData());
                            break;
                        case BODY:
                            xmlEvent = xmlEventReader.nextEvent();
                            eMail.setBody(xmlEvent.asCharacters().getData());
                            break;
                        default:
                            break;
                    }
                }
                // se siamo arrivati al tag di chiusura dell'email aggiungiamola all'arraylist eMails
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals(EMAIL)) {
                        eMails.add(eMail);
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return eMails;
    }
    
    public static void main(String args[]) {
        StAXExampleReader stAXExampleReader = new StAXExampleReader();
        List<EMail> eMails = stAXExampleReader.leggiFileXML("emails.xml");
        for (EMail eMail : eMails) {
            System.out.println(eMail);
        }
    }

}