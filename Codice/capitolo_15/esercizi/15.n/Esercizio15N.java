package rubrica.test;

import rubrica.presentation.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import java.util.*;

public class Esercizio15N {
    
    private void eseguiTest() {
        RubricaCLI cli = new RubricaCLI();
        cli.visualizzaContatti(getContatti());
    }

    private List<Contatto> getContatti() {
        List<Contatto> contatti = new ArrayList<>();
        Contatto contatto1 = new Contatto("Daniele","01234560","Via delle chitarre 1");
        Contatto contatto2 = new Contatto("Giovanni","0565432190","Via delle scienze 2");
        Contatto contatto3 = new Contatto("Ligeia","07899921","Via dei segreti 3");
        contatti.add(contatto1);
        contatti.add(contatto2);
        contatti.add(contatto3);
        return contatti;
    }

    public static void main(String args[]) {
        Esercizio15N esercizio15N = new Esercizio15N();
        esercizio15N.eseguiTest();
    }
}