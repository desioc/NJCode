package com.claudiodesio.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditorInterattivo {

    public static void main(String args[]) {
        File file = new File("file.txt");
        try (Scanner scanner = new Scanner(System.in);
                FileWriter fileWriter = new FileWriter(file);) {
            String stringa = "";
            System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma");
            while (!(stringa = scanner.nextLine()).equals("fine")) {
                System.out.println("Hai digitato " + stringa);
                fileWriter.append(stringa);
                fileWriter.flush();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Fine programma!");
    }
}