import java.util.*;

public class Esercizio10G {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("1");
        list.add('2');
        list.add(3);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}