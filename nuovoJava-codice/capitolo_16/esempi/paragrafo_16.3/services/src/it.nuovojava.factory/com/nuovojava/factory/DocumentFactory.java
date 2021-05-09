package it.nuovojava.factory;

import it.nuovojava.spi.Document;
import java.util.Iterator;
import java.util.ServiceLoader;

public class DocumentFactory {

    public static Document getDocument(String documentId) {
        ServiceLoader<Document> serviceLoader = ServiceLoader.load(it.nuovojava.spi.Document.class);
        for (Document document : serviceLoader) {
            if (document.getType().equals(documentId)) {
                return document;
            }
        }
        throw new IllegalArgumentException("Nessun documento trovato con ID=" + documentId);
    }
}
