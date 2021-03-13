import java.util.*;
import java.util.stream.*;

public class TestReduce {
    public static void main(String args[]) {
        Set<String> parole = Set.of("Java" , "C" , "C++" , "C#");
        Optional<String> parolaOptional = parole.stream()
            .reduce((parola1, parola2) -> 
            parola1.length() > parola2.length() ? parola1 : parola2);
         if (parolaOptional.isPresent()) {
             System.out.println(parolaOptional.get());
         }
    }
}