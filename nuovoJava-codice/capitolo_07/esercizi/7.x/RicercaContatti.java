package rubrica.interfaccia;

import rubrica.dati.*;
import rubrica.business.Utente;
import java.util.Scanner;

public class RicercaContatti {
    public static void main(String args[]) {
        System.out.println("Ricerca Contatti");
        System.out.println();
        var utente = new Utente();
        System.out.println("Inserisci nome o parte del nome da ricercare");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Contatto[] contattiTrovati = utente.cercaContattiPerNome(input);
        System.out.println("Contatti trovati con nome contenente \"" + input +"\"" );
        for (Contatto contatto : contattiTrovati) {
            if (contatto != null) {
                System.out.println(contatto+"\n");
            }
        }
    }
}