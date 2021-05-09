import java.util.*;

public class Esercizio10O {
    public static int getSize(List/*INSERISCI CODICE QUI*/ list) {
        return list.size();
    }
    
    public static void main(String args[]) {
        System.out.println(getSize(new ArrayList<Integer>()));
        System.out.println(getSize(new ArrayList<HashMap<String, List<String>>>()));
    }
}