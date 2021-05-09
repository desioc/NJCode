package it.nuovojava.certs;

import it.nuovojava.spi.Document;

public class CertFactory {
    public static Document provider() {
        return new Certificate("Creato con provider!");
    }
}