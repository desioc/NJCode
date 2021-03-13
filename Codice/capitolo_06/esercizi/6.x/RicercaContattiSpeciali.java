import java.util.Scanner;

public class RicercaContattiSpeciali {
    public static void main(String args[]) {
        System.out.println("Ricerca Contatti Speciali");
        System.out.println();
        var rubrica = Rubrica.getInstance();
        System.out.println("Inserisci nome o parte del nome da ricercare");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Speciale[] contattiSpecialiTrovati = rubrica.cercaContattiSpecialiPerNome(input);
        System.out.println("Contatti Speciali trovati con nome contenente \"" + input +"\"" );
        for (Speciale speciale : contattiSpecialiTrovati) {
            if (speciale != null) {
                speciale.stampaDettagli();
            }
        }
    }
}