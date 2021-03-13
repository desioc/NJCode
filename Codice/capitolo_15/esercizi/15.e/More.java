package com.claudiodesio.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class More {

    private final static int numeroRighe = 10;
    private static final String QUIT_COMMAND = "q";
    private static final String NEXT_COMMAND = "n";

    public static void main(String args[]) {
        String carattere;
        System.out.println("Digita il nome di un file e batti enter, oppure "
                + "scrivi \"" + QUIT_COMMAND + "\" per terminare il programma");
        try (Scanner in = new Scanner(System.in);) {
            String nomeFile;
            if (!(nomeFile = in.nextLine()).equals(QUIT_COMMAND)) {
                File file = new File(nomeFile);
                try (Scanner fileScanner = new Scanner(file)) {
                    System.out.println("File trovato! \"" + nomeFile + "\", scrivi \"n\" per vedere le prossime 10 righe");
                    while (!(carattere = in.nextLine()).equals(QUIT_COMMAND)) {
                        if (carattere.equals(NEXT_COMMAND)) {
                            for (int i = 0; fileScanner.hasNext() && i < numeroRighe; i++) {
                                System.out.println(fileScanner.nextLine());
                            }
                        }
                    }
                } catch (FileNotFoundException exc) {
                    System.out.println("File non trovato!");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Fine programma!");
    }

}