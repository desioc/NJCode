import java.util.Scanner;

public class RicercaContatti {
    public static void main(String args[]) {
        System.out.println("Ricerca Contatti");
        System.out.println();
        var rubrica = Rubrica.getInstance();
        System.out.println("Inserisci nome o parte del nome da ricercare");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Contatto[] contattiTrovati = rubrica.cercaContattiPerNome(input);
        System.out.println("Contatti trovati con nome contenente \"" + input +"\"" );
        for (Contatto contatto : contattiTrovati) {
            if (contatto != null) {
                contatto.stampaDettagli();
            }
        }
    }
}