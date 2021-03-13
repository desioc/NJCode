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
    private static final String EXECUTE ="/e";
    private static final String BACK ="/b";
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
                int size = contatti.size();
                for (int i = 1; i <= size; ++i) {
                    System.out.println(i +"\t"+contatti.get(i-1).getNome());
                }
                System.out.printf("Scrivi '%s' e il nome del contatto per visualizzarne i dettagli\n", SHOW_CONTACT);
            }
            System.out.printf("Scrivi '%s' per inserire un nuovo contatto\n", INSERT);
            System.out.printf("Scrivi '%s' per terminare il programma\n", END);
            String comando = scanner.nextLine();
            controller.gestisciVisualizzaContatti(comando, contatti);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void inserisciContatto() {
        try {
            String nome = getDatoContatto("nome");
            String numeroDiTelefono = getDatoContatto("numero di telefono");
            String indirizzo = getDatoContatto("indirizzo");
            System.out.printf("Scrivi '%s' per confermare l'inserimento\n",
                                                                       EXECUTE);
            System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei"
                + " contatti\n", BACK);
            String comando = scanner.nextLine();
            controller.gestisciInserisciContatto(comando, nome, 
                                                   numeroDiTelefono, indirizzo);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void visualizzaConferma(String messaggio) {
        try {
            System.out.println("Operazione confermata!");
            visualizzaMessaggio(messaggio);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    private void visualizzaMessaggio(String messaggio) throws IOException, 
                                                      ComandoNonValidoException{
        System.out.println(messaggio +"\n");
        System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei "
            + "contatti\n", BACK);
        System.out.printf("Scrivi '%s' per terminare il programma\n", END);
        String comando = scanner.nextLine();
        controller.gestisciVisualizzaConferma(comando);
    }

    private String getDatoContatto(String dato) {
        String messaggio = String.format("Inserisci %s del contatto:", dato);
        return leggiInputUtente(messaggio);
    }

    private String leggiInputUtente(String messaggio) {
        System.out.printf(messaggio);
        return scanner.nextLine();
    }


    class RubricaController {
        GestoreSerializzazione gestoreFile;

        public RubricaController () {
            try {
                gestoreFile = 
                      GestoreSerializzazioneFactory.getGestoreSerializzazione();
            } catch (Exception exc) {
                exc.printStackTrace();
                System.exit(1);
            }
        }

        public void start() throws IOException {
            List<Contatto> contatti = gestoreFile.getContatti();
            visualizzaContatti(contatti);
        }

        public void gestisciVisualizzaContatti(String comando,  List<Contatto> contatti) throws IOException {
            if (comando.equals(INSERT)) {
                //System.out.println("Chiamato metodo inserisci contatto");
                inserisciContatto();
            } else if (comando.equals(END)) {
                System.out.println("Programma terminato");
                System.exit(1);
            } else if (isComandoValidoPerVisualizzaContatto(contatti, comando)) {
                System.out.printf("Chiamato metodo visualizza contatto per "
                    + "%s\n", estraiNomeContatto(comando));
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        public void gestisciInserisciContatto(String comando, String nome,  String numeroDiTelefono, String indirizzo) throws IOException, NomeVuotoException {
            if (comando.equals(EXECUTE)) {
                Contatto contatto = new Contatto(nome, numeroDiTelefono, 
                    indirizzo);
                gestoreFile.inserisci(contatto);
                visualizzaConferma("Inserito contatto:\n"+ contatto);
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreFile.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        public void gestisciVisualizzaConferma(String comando) throws 
                                        IOException, ComandoNonValidoException {
            if (comando.equals(END)) {
                System.out.println("Programma terminato");
                System.exit(1);
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreFile.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        private boolean isComandoValidoPerVisualizzaContatto(List<Contatto> contatti, String comando) throws ContattoInesistenteException,  ComandoNonValidoException {
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
    }
}