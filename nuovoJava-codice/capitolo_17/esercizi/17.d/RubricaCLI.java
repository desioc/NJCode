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
    private static final String UPDATE_CONTACT ="/u";
    private static final String REMOVE_CONTACT ="/r";
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
        } catch (Exception exc) {
            visualizzaErrore(exc);
        }
    }

    public void visualizzaContatto(Contatto contatto) {
        try {
            System.out.println("Dettagli del contatto selezionato:\n"+ contatto);
            System.out.printf("Scrivi '%s' per modificare il contatto\n", UPDATE_CONTACT);
            System.out.printf("Scrivi '%s' per rimuovere il contatto\n", REMOVE_CONTACT);
            System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei contatti\n", BACK);
            String comando = scanner.nextLine();
            controller.gestisciVisualizzaContatto(comando, contatto);
        }
        catch (Exception exc) {
            visualizzaErrore(exc);
        }
    }

    public void modificaContatto(Contatto contatto) {
        try {
            String numeroDiTelefono = getDatoContatto("numero di telefono");
            String indirizzo = getDatoContatto("indirizzo");
            System.out.printf("Scrivi '%s' per confermare la modifica\n", EXECUTE);
            System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei contatti\n", BACK);
            String comando = scanner.nextLine();
            controller.gestisciModificaContatto(comando, contatto.getNome(), numeroDiTelefono, indirizzo);
        }
        catch (Exception exc) {
            visualizzaErrore(exc);
        }
    }


    public void rimuoviContatto(Contatto contatto) {
        try {
            System.out.printf("Scrivi '%s' per confermare la rimozione\n", EXECUTE);
            System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei contatti\n", BACK);
            String comando = scanner.nextLine();
            controller.gestisciRimuoviContatto(comando, contatto.getNome());
        }
        catch (Exception exc) {
            visualizzaErrore(exc);
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
            visualizzaErrore(exc);
        }
    }

    public void inserisciContatto() {
        try {
            String nome = getDatoContatto("nome");
            String numeroDiTelefono = getDatoContatto("numero di telefono");
            String indirizzo = getDatoContatto("indirizzo");
            System.out.printf("Scrivi '%s' per confermare l'inserimento\n", EXECUTE);
            System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei contatti\n", BACK);
            String comando = scanner.nextLine();
            controller.gestisciInserisciContatto(comando, nome, numeroDiTelefono, indirizzo);
        } catch (Exception exc) {
            visualizzaErrore(exc);
        }
    }

    public void visualizzaConferma(String messaggio) {
        System.out.println("Operazione confermata!");
        visualizzaMessaggio(messaggio);
    }

    public void visualizzaErrore(Exception exc) {
        System.out.println("C'è un problema!");
        visualizzaMessaggio(exc.toString());
    }

    private void visualizzaMessaggio(String messaggio) {
        try {
            System.out.println(messaggio +"\n");
            System.out.printf("Scrivi '%s' per tornare alla visualizzazione dei contatti\n", BACK);
            System.out.printf("Scrivi '%s' per terminare il programma\n", END);
            String comando = scanner.nextLine();
            controller.gestisciVisualizzaMessaggio(comando);
        }
        catch (Exception exc) {
            visualizzaMessaggio(messaggio);
        }
    }

    private String getDatoContatto(String dato) {
        String messaggio = String.format("Inserisci %s del contatto:", dato);
        return leggiInputUtente(messaggio);
    }

    private String leggiInputUtente(String messaggio) {
        System.out.println(messaggio);
        return scanner.nextLine();
    }


    class RubricaController {
        GestoreSerializzazione<Contatto> gestoreSerializzazione;

        public RubricaController () {
            try {
                gestoreSerializzazione = GestoreSerializzazioneFactory.getGestoreSerializzazione();
            } catch (Exception exc) {
                exc.printStackTrace();
                System.exit(1);
            }
        }

        public void start() throws Exception {
            List<Contatto> contatti = gestoreSerializzazione.getContatti();
            visualizzaContatti(contatti);
        }

        public void gestisciVisualizzaContatti(String comando,List<Contatto> contatti) throws Exception {
            if (comando.equals(INSERT)) {
                //System.out.println("Chiamato metodo inserisci contatto");
                inserisciContatto();
            } else if (comando.equals(END)) {
                System.out.println("Programma terminato");
                System.exit(1);
            } else if (isComandoValidoPerVisualizzaContatto(contatti, comando)) {
                String nomeContatto = estraiNomeContatto(comando);
                System.out.printf("Chiamato metodo visualizza contatto per %s\n", nomeContatto);
                Contatto contatto = gestoreSerializzazione.recupera(nomeContatto);
                visualizzaContatto(contatto);
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        public void gestisciVisualizzaContatto(String comando,Contatto contatto) throws Exception {
            if (comando.equals(UPDATE_CONTACT)) {
                modificaContatto(contatto);
            } else if (comando.equals(REMOVE_CONTACT)) {
                rimuoviContatto(contatto);
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreSerializzazione.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        public void gestisciInserisciContatto(String comando, String nome, String numeroDiTelefono, String indirizzo) throws Exception {
            if (comando.equals(EXECUTE)) {
                Contatto contatto = new Contatto(nome, numeroDiTelefono, indirizzo);
                gestoreSerializzazione.inserisci(contatto);
                visualizzaConferma("Inserimento confermato:\n"+ contatto);
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreSerializzazione.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        public void gestisciModificaContatto(String comando, String nome, String numeroDiTelefono, String indirizzo) throws Exception {
            if (comando.equals(EXECUTE)) {
                Contatto contatto = new Contatto(nome, numeroDiTelefono, indirizzo);
                gestoreSerializzazione.modifica(contatto);
                visualizzaConferma("Modifica confermata:\n"+ contatto);
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreSerializzazione.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }

        public void gestisciRimuoviContatto(String comando, String nome) throws Exception {
            if (comando.equals(EXECUTE)) {
                gestoreSerializzazione.rimuovi(nome);
                visualizzaConferma("Rimozione confermata:\n"+ nome);
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreSerializzazione.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
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

        public void gestisciVisualizzaMessaggio(String comando) throws Exception {
            if (comando.equals(BACK)) {
                visualizzaContatti(gestoreSerializzazione.getContatti());
            } else if (comando.equals(BACK)) {
                visualizzaContatti(gestoreSerializzazione.getContatti());
            } else {
                throw new ComandoNonValidoException(comando);
            }
        }


        public String estraiNomeContatto(String comando) {
            return comando.substring(comando.indexOf(" ")+1, comando.length());
        }
    }
}