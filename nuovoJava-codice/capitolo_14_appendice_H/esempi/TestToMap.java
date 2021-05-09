import java.util.*;
import java.util.stream.*;

public class TestToMap {
    public static void main(String args[]) {
        Set<Persona> persone = Set.of(
            new Persona(1, "Mario"),
            new Persona(2, "Roberta"),
            new Persona(3, "Chiara"));
        Map<Integer,String> mappa = persone
            .stream()
            .collect(Collectors.toMap(Persona::id,
            Persona::nome));
        System.out.println(mappa);
    }
}