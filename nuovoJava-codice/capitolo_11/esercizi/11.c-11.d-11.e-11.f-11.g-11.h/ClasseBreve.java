package dati;

import metadati.Bean;
import metadati.Breve;
import metadati.Specifica;

@Breve
@Specifica(1)
@Bean(numeroMassimoMetodi = 10, numeroMinimoVariabili = 1)
public class ClasseBreve {

    public void metodo1() {
        System.out.println("metodo1");
    }
    private String variabile;

    public String getVariabile() {
        return variabile;
    }

    public void setVariabile(String variabile) {
        this.variabile = variabile;
    }
}