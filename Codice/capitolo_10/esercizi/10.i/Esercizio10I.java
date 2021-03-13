import java.util.*;

public class Esercizio10I {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add(null);
        list.add('3');
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}