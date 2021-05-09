package dati;

import metadati.Bean;
import metadati.Breve;
import metadati.Specifica;

@Breve
@Specifica(3)
@Bean(numeroMassimoMetodi = 10, numeroMinimoVariabili = 1)
public class ClasseLunga {

    public String variabile1;
    public String variabile2;

    public void metodo1() {
        System.out.println("metodo1");
    }

    public void metodo2() {
        System.out.println("metodo2");
    }

    public void metodo3() {
        System.out.println("metodo3");
    }

    public void metodo4() {
        System.out.println("metodo4");
    }
}