package it.nuovojava.client;

import it.nuovojava.handlers.Trademarker;
import java.util.Scanner;

public class TrademarkClient {
    public static void main(String args[]){
        System.out.println("Per aggiungere il trademark batti:"
                + "\n'C + invio' per un certificato "
                + "\n'I + invio' per una fattura"
                + "\n Per terminare il programma batti 'E + invio'");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String command = scanner.nextLine();
			try {
				if (command.equals("I") ||  command.equals("C")){
					Trademarker trademarker = new Trademarker();
					trademarker.addTrademark(command, "Claudio De Sio Cesari");
				} else if (command.equals("E")) {
					System.out.println("Ciao, alla prossima!");
					System.exit(0);
				} else {
					System.out.println("Comando ignorato!");
				}
			} catch (IllegalArgumentException exception) {
				System.out.println(exception.getMessage());
			}
        }
    }
}
