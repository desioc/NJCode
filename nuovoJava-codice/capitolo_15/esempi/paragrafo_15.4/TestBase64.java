import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.util.stream.*;

public class TestBase64 {
    private static final String FILE = "persona.base64";
    public static void main(String args[]) throws IOException {
        Base64.Encoder encoder = Base64.getMimeEncoder();
         Persona p = new Persona ("Claudio", "De Sio Cesari", "xxx");
        try (FileOutputStream f = 
               new FileOutputStream (new File(FILE));
             ObjectOutputStream s = new ObjectOutputStream (f);) {
            OutputStream os = encoder.wrap(s);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject (p);
            System.out.println("Oggetto serializzato: " + p);
        } 
        
        Path originalPath = Paths.get("TestBase64.java"),
        encodedPath = Paths.get("Base64Demo.java.base64");
        encoder = Base64.getMimeEncoder();
        try (OutputStream output = Files.newOutputStream(encodedPath)) {
            Files.copy(originalPath, encoder.wrap(output));
        }
        Path decodedPath = Paths.get("Base64Demo.java.decoded");
        Base64.Decoder decoder = Base64.getMimeDecoder();
        try (InputStream input = Files.newInputStream(encodedPath)) {
            Files.copy(decoder.wrap(input), decodedPath);
        }
    }
}