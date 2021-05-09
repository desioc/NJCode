package it.nuovojava.factory;

import it.nuovojava.docs.Certificate;
import it.nuovojava.docs.Invoice;
import it.nuovojava.spi.Document;

public class DocumentFactory {

    public static Document getDocument(String documentId) {
        return switch (documentId) {
            case "I" -> new Invoice();
            case "C" -> new Certificate();
            default -> throw new IllegalArgumentException("Invalid Document ID");
        };
    }
}