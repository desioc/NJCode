package rubrica.interfaccia;

import rubrica.dati.*;
import rubrica.business.Utente;
import java.util.Scanner;

public class RicercaContattiOrdinari {
    public static void main(String args[]) {
        System.out.println("Ricerca Contatti Ordinari");
        System.out.println();
        var utente = new Utente();
        System.out.println("Inserisci nome o parte del nome da ricercare");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Contatto[] contattiTrovati = utente.cercaContattiOrdinariPerNome(input);
        System.out.println("Contatti ordinari trovati con nome contenente \"" + input +"\"" );
        for (var contatto : contattiTrovati) {
            if (contatto != null) {
                System.out.println(contatto+"\n");
            }
        }
    }
}