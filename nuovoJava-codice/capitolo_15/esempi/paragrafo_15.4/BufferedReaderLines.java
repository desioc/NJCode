import java.io.*;
import java.util.stream.*;
import java.util.*;
import java.net.*;
public class BufferedReaderLines {
    public static void main (String args[]) throws IOException {
        URL url = new URL("http://www.claudiodesio.com");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            Stream<String> lines = reader.lines();
            Optional<String> claudio = lines.filter(s -> s.contains("claudio")).findFirst();
            claudio.ifPresent(System.out::println);
        }
    }
}