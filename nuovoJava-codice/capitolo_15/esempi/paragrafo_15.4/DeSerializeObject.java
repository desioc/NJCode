import java.io.*;

public class DeSerializeObject {
    public static void main (String args[]) throws Exception {
        Persona p = null;
        try (FileInputStream f =
                new FileInputStream (new File("persona.ser"));
                ObjectInputStream s = new ObjectInputStream (f);) {
            p = (Persona)s.readObject();
            System.out.println("Oggetto deserializzato!");
            System.out.println(p);
        }
    }
}