import java.io.*;
import java.util.stream.*;
import java.util.*;
import java.net.*;
public class KeyboardInput {
    public static void main (String args[]) throws IOException{
        String stringa = null;
        System.out.println("Digita qualcosa e premi invio...\nPer terminare il programma digitare \"fine\"");
        try (InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr)) {
            stringa = in.readLine();
            while ( stringa != null ) {
                if (stringa.equals("fine")) {
                    System.out.println("Programma terminato");
                    break;
                }
                System.out.println("Hai scritto: "+ stringa);
                stringa = in.readLine();
            }
        }
    }
}