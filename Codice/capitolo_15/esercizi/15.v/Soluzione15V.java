import java.io.*;

public class Soluzione15V {
    public static void main(String args[]) throws Exception {
        try (FileInputStream fis = new FileInputStream("nuovo file.txt");
        DataInputStream dis = new DataInputStream(fis);) {
            for (int i = 0; i < 50; i++) {
                System.out.println(dis.readInt());
            }
        }
    }
}