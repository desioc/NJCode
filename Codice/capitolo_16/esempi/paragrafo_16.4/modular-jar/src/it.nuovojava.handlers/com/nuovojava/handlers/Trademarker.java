package it.nuovojava.handlers;

import it.nuovojava.factory.DocumentFactory;
import it.nuovojava.spi.Document;

public class Trademarker {

    public void addTrademark(String documentId, String trademark) {
        Document document  = DocumentFactory.getDocument(documentId);
		document.addTrademark(trademark);
    }

}
