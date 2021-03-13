package it.nuovojava.certs;

import it.nuovojava.spi.Document;

public class Certificate implements Document {

    @Override
    public void addTrademark(String trademark) {
        System.out.println("Aggiunto trademark ad un certificato!");
    }

    @Override
    public String getType() {
        return "C";
    }

}
