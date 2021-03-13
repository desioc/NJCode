import java.util.*;

public class Esercizio4W {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un operando e batti enter, tutte le volte che vuoi."
                + "\nQuando hai finito scegli l'operazione da eseguire e batti enter.");
        stampaTabellaOperazioni();
        String temp;
        String operandiString = "";
        while (isNotOperation(temp = scanner.nextLine())) {
            operandiString += temp + "-";
        }
        if (isNotOperation(temp)) {
            System.out.println("Errore codice operazione");
        }
        String[] operandiArray = operandiString.split("-");
        double[] operandi = new double[operandiArray.length];
        for (int i = 0; i < operandiArray.length; i++) {
            operandi[i] = Double.parseDouble(operandiArray[i]);
        }
        double risultato = eseguiOperazione(operandi, temp);
        System.out.println("Risultato = " + risultato);
    }

    private static boolean isNotOperation(String line) {
        if (line.equals("+") || line.equals("x") || line.equals("u") || line.equals("m")) {
            return false;
        }
        return true;
    }

    private static double eseguiOperazione(double[] operandi, String operazione) {
        StranaCalcolatrice stranaCalcolatrice = new StranaCalcolatrice();
        switch (operazione) {
            case "+":
                return stranaCalcolatrice.somma(operandi);
            case "x":
                return stranaCalcolatrice.moltiplica(operandi);
            case "u":
                return stranaCalcolatrice.massimo(operandi);
            case "m":
                return stranaCalcolatrice.minimo(operandi);
            default:
                System.out.println("Operazione specificata " + operazione + " non valida");
                System.exit(1);
                return Double.NaN;
        }
    }

    private static void stampaTabellaOperazioni() {
        System.out.println("'+' : somma");
        System.out.println("'x' : moltiplica");
        System.out.println("'u' : massimo");
        System.out.println("'m' : minimo");
    }
}