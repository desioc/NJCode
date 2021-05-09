package it.nuovojava.invs;

import it.nuovojava.spi.Document;

public class Invoice implements Document {

    @Override
    public void addTrademark(String trademark) {
        System.out.println("Aggiunto trademark ad un fattura!");
    }

    @Override
    public String getType() {
        return "I";
    }

}
