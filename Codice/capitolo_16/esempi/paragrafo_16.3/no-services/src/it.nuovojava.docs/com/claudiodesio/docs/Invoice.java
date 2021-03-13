package it.nuovojava.docs;

import it.nuovojava.spi.Document;

public class Invoice implements Document {

    @Override
    public void addTrademark(String trademark) {
        System.out.println("Aggiunto trademark ad un fattura!");
    }

}
