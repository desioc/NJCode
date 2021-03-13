import java.util.Arrays;

public class Esercizio13S {
    public static void main(String args[]) {
        Persona [] persone = {
            new Persona("Antonio",21),
            new Persona("Bruno",20),
            new Persona("Giorgio",19),
            new Persona("Martino",22),
            new Persona("Daniele",21)
        };
        Arrays.sort(persone, /*INSERISCI CODICE QUI*/Persona::compareTo);
        System.out.println(Arrays.toString(persone));
    }
}