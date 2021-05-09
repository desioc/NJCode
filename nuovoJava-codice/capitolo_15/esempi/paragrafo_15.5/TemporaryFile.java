import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class TemporaryFile {
    public static void main(String args[]) {
        try {
            Path fileTemporaneo = Files.createTempFile(null, ".tmp");
            System.out.format("Creato il file temporaneo: " +
            fileTemporaneo);
        } catch (IOException exc) {
            System.err.println("IOException: " + exc);
        }
    }
}