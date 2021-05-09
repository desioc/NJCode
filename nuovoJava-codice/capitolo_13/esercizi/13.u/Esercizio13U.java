import java.util.Arrays;
import java.util.function.BiPredicate;

public class Esercizio13U {
    public static void main(String args[]) {
        Persona [] persone = {
            new Persona("Antonio",21),
            new Persona("Bruno",20),
            new Persona("Giorgio",19),
            new Persona("Martino",22),
            new Persona("Daniele",21)
        };
        Persona personaCheIniziaPerD = getPersonaCheIniziaPer("D", persone, /*INSERISCI CODICE QUI*/
            (String iniziale, Persona persona) -> persona.getNome().startsWith(iniziale));
        System.out.println(personaCheIniziaPerD);
    }
    
    static Persona getPersonaCheIniziaPer(String iniziale, Persona[] persone, BiPredicate<String, Persona> biPredicate){
        for(Persona persona : persone) {
            if (biPredicate.test(iniziale, persona)) {
                return persona;
            }
        }
        return null;
    }
}