import java.util.*;

public class TestOrdinamento {
    public static void main(String args[]) {
        String [] nomi = {"Marcello","Serena","Antonio"} ;
        System.out.println("Array non ordinato:");
        stampaArray(nomi);
        Arrays.sort(nomi);
        System.out.println("\nArray ordinato:");
        stampaArray(nomi);
        
        List<String> nomiList = new ArrayList<String>(Arrays.asList(nomi));
        System.out.println("List non ordinata:");
        stampaList(nomiList);
        Collections.sort(nomiList, new StringComparator());
        System.out.println("List ordinata a stringhe al contrario:");
        stampaList(nomiList);
    }

    public static void stampaList(List<String> list) {
        for (String nome: list) {
            System.out.println(nome);
        }
    }

    public static void stampaArray(String array[]) {
        for (String nome: array) {
            System.out.println(nome);
        }
    }
}