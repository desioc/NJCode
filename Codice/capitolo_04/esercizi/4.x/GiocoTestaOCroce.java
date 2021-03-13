import java.util.*;

public class GiocoTestaOCroce {
    public static void main(String args[]) {
        System.out.println("Cosa scegli testa o croce?");
        Scanner scanner = new Scanner(System.in);
        String scelta = scanner.nextLine();
        if ("testa".equals(scelta)) {
            System.out.println("Ok, lancio...");
            TestaOCroce testaOCroce = new TestaOCroce();
            String risultatoLancio = testaOCroce.dammiTestaOCroce();
            System.out.print("È uscito " +  risultatoLancio + "...");
            System.out.println("testa".equalsIgnoreCase(risultatoLancio)? "hai vinto!" : "hai perso!");
        } else if ("croce".equals(scelta)) {
            System.out.println("Ok, lancio...");
            TestaOCroce testaOCroce = new TestaOCroce();
            String risultatoLancio = testaOCroce.dammiTestaOCroce();
            System.out.print("È uscito " +  risultatoLancio + "...");
            System.out.println("croce".equalsIgnoreCase(risultatoLancio)? "hai vinto!" : "hai perso!");
        } else {
            System.out.println("Mi dispiace, puoi scrivere solo testa o croce, riprova...");
            System.out.println("Programmata terminato... ciao!");
        }
    }
}