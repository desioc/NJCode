import java.util.*;

public class TestCollectionContainsAll {
    public static void main(String args[]) {
        Collection<Integer> collection1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           collection1.add(i);
        }
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(2);
        collection2.add(1);
        collection2.add(4);
        System.out.println(collection1.containsAll(collection2));
    }
}