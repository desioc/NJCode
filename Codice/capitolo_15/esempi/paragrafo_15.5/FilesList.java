import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FilesList {
    public static void main (String args[]) throws IOException {
        Path pathToDirectory = Paths.get(".");
        try (Stream<Path> files = Files.list(pathToDirectory)) {
            files.filter(p -> p.getFileName().toString().endsWith(".java")).forEach(System.out::println);
        }
    }
}