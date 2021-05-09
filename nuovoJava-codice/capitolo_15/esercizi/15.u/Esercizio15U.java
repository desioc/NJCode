import java.io.*;

public class Esercizio15U {
    public static void main(String args[]) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("nuovo file.txt");
        DataOutputStream dos = new DataOutputStream(fos);) {
            dos.writeInt(8);
            dos.writeDouble(0.1176);
        }
    }
}