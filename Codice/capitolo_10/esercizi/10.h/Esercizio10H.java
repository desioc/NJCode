import java.util.*;

public class Esercizio10H {
    public static void main(String args[]) {
        List<Object> list = new ArrayList<>();
        list.add("1");
        list.add('2');
        list.add(3);
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}