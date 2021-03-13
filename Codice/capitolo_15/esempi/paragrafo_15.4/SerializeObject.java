import java.io.*;

public class SerializeObject {
    public static void main (String args[]) throws IOException {
        Persona p = new Persona ("Claudio", "De Sio Cesari", "xxx");
        try (FileOutputStream f = 
               new FileOutputStream (new File("persona.ser"));
             ObjectOutputStream s = new ObjectOutputStream (f);) {
            s.writeObject (p);
            System.out.println("Oggetto serializzato!");
        } 
    }
}