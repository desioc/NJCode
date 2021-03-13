package rubrica.presentation;

import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.integrazione.*;
import java.util.*;
import java.io.*;

public class RubricaCLI {
    private Scanner scanner;
    private RubricaController controller;
    private static final String INSERT ="/i";
    private static final String SHOW_CONTACT ="/v";
    private static final String END ="/t";

    public RubricaCLI() {
        scanner = new Scanner(System.in);
        controller = new RubricaController();
    }

    public void start() {
        try {
            controller.start();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void visualizzaContatti(List<Contatto> contatti) {
        try {
            int numeroContatti = contatti.size();
            if (numeroContatti == 0) {
                System.out.println("Nessun contatto trovato");
            } else {
                System.out.println("Lista dei contatti in Rubrica:");
                for (Contatto contatto : contatti) {
                    System.out.println(contatto.getNome());
                }
                System.out.printf("Scrivi '%s' seguito dal nome di un contatto, per visualizzarne i dettagli\n", SHOW_CONTACT);
            }
            System.out.printf("Scrivi '%s' per inserire un nuovo contatto\n", INSERT);
            System.out.printf("Scrivi '%s' per terminare il programma\n", END);
            String comando = scanner.nextLine();
            if (comando.equals(INSERT)) {
                System.out.println("Chiamato metodo inserisci contatto");
            } else if (comando.equals(END)) {
                System.out.println("Programma terminato");
                System.exit(1);
            } else if (isComandoValidoPerVisualizzaContatto(contatti, comando)) {
                System.out.printf("Chiamato metodo visualizza contatto per %s\n", estraiNomeContatto(comando));
            } else {
                throw new ComandoNonValidoException(comando);
            }
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    private boolean isComandoValidoPerVisualizzaContatto(List<Contatto> contatti, String comando) throws ContattoInesistenteException, ComandoNonValidoException {
        boolean result = false;
        if (comando.startsWith(SHOW_CONTACT)) {
            for (Contatto contatto : contatti) {
                if (comando.endsWith(contatto.getNome())) {
                    return true;
                }
            }
        } else {
            throw new ComandoNonValidoException(comando);
        }
        throw new ContattoInesistenteException(String.format("Contatto %s non trovato!", estraiNomeContatto(comando)));
    }

    public String estraiNomeContatto(String comando) {
        return comando.substring(comando.indexOf(" ")+1, comando.length());
    }

    class RubricaController {
        GestoreSerializzazione gestoreFile;
        public RubricaController () {
            try {
                gestoreFile = GestoreSerializzazioneFactory.getGestoreSerializzazione();
            } catch (Exception exc) {
                exc.printStackTrace();
                System.exit(1);
            }
        }

        public void start() throws IOException {
            List<Contatto> contatti = gestoreFile.getContatti();
            visualizzaContatti(contatti);
        }
    }
}