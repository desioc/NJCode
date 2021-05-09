import java.time.temporal.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.time.*;

public class FilesFind {
    public static void main (String args[]) throws IOException {
        Path directory = Paths.get(".");
        Instant lastHalfAnHour  = Instant.now().minus(30, ChronoUnit.MINUTES);
        try (Stream<Path> files = Files.find(directory, 1,
                (path, attributes) -> attributes.creationTime().toInstant().compareTo(lastHalfAnHour) >= 0)) {
            files.forEach(System.out::println);
        }
    }
}