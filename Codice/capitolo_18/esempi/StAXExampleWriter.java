import java.io.FileOutputStream;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;

public class StAXExampleWriter {

    public void salvaFileXML(String fileXML) throws Exception {
        // creiamo un XMLOutputFactory
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        // crea un XMLEventWriter
        XMLEventWriter xmlEventWriter = xmlOutputFactory
                .createXMLEventWriter(new FileOutputStream(fileXML));
        // creiamo un XMLEventFactory
        XMLEventFactory xmlEventFactory = XMLEventFactory.newInstance();
        //XMLEvent end = xmlEventFactory.createDTD("\n");
        // creiamo e aggiungiamo a xmlEventWriter un inizio di documento
        StartDocument startDocument = xmlEventFactory.createStartDocument();
        xmlEventWriter.add(startDocument);
        Characters acapo = xmlEventFactory.createCharacters("\n");
        xmlEventWriter.add(acapo);
        // creiamo e aggiungiamo a xmlEventWriter il tag 'email' iniziale
        StartElement startElement = xmlEventFactory.createStartElement("", "", "utente");
        xmlEventWriter.add(startElement);
        xmlEventWriter.add(acapo);
        //xmlEventWriter.add(end);
        // Write the different nodes
        creaTag(xmlEventWriter, "nome", "Claudio");
        creaTag(xmlEventWriter, "cognome", "De Sio Cesari");
        xmlEventWriter.add(xmlEventFactory.createEndElement("", "", "utente"));
        //xmlEventWriter.add(end);
        xmlEventWriter.add(xmlEventFactory.createEndDocument());
        xmlEventWriter.close();
    }
    // crea un tag innestato con indentazione
    private void creaTag(XMLEventWriter xmlEventWriter, String nomeTag, String contenutoTag) throws XMLStreamException {
        XMLEventFactory xmlEventFactory = XMLEventFactory.newInstance();
        // create il tag di apertura e aggiungiamolo a xmlEventWriter
        StartElement tagDiApertura = xmlEventFactory.createStartElement("", "", nomeTag);
        Characters acapo = xmlEventFactory.createCharacters("\n");
        Characters spazi = xmlEventFactory.createCharacters("  ");
        xmlEventWriter.add(spazi);
        xmlEventWriter.add(tagDiApertura);
        // creiamo il contenuto del tag e aggiungiamolo a xmlEventWriter
        Characters characters = xmlEventFactory.createCharacters(contenutoTag);
        xmlEventWriter.add(characters);
        // creiamo il tag di chiusura
        EndElement tagDiChiusura = xmlEventFactory.createEndElement("", "", nomeTag);
        xmlEventWriter.add(tagDiChiusura);
        xmlEventWriter.add(spazi);
        xmlEventWriter.add(acapo);
    }

    public static void main(String[] args) {
        StAXExampleWriter stAXExampleWriter = new StAXExampleWriter();
        try {
            stAXExampleWriter.salvaFileXML("testScritturaConStAx.xml");
            System.out.println("File salvato!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}