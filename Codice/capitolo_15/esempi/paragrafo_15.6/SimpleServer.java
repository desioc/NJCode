import java.io.*;
import java.net.*;

public class SimpleServer {

    public static void main(String args[]) {
        try (ServerSocket serverSocket = new ServerSocket(9999);) {
            System.out.println("Server avviato, in ascolto sulla " 
                    + "porta 9999");
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                        OutputStream clientOutputStream = clientSocket.getOutputStream();
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientOutputStream));) {
                    bufferedWriter.write("Ciao client sono il server!");
                    System.out.println("Messaggio spedito a " + clientSocket.getInetAddress());
                } catch (ConnectException connExc) {
                    System.err.println("Questo client non riesce a connettersi con il server: " + connExc.getMessage());
                } catch (IOException e) {
                    System.err.println("Problema inaspettato: " + e.getMessage());
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}