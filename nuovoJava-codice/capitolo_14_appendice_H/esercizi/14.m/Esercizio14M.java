import java.util.*;

public class Esercizio14M {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>(3);
        list.add("*");
        list.add("@");
        list.set(1, "$");
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}