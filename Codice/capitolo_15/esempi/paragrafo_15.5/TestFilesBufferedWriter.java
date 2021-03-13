import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;

public class TestFilesBufferedWriter {
    public static void main(String args[]) {
        Charset charset = Charset.forName("UTF-8");
        String contenutoDelFile = "Ciao";
        Path path = Paths.get("C:\\Users\\user\\Desktop\\test.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
            writer.write(contenutoDelFile, 0, contenutoDelFile.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}