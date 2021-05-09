import java.util.*;

public class TestCollectionRetainAll {
    public static void main(String args[]) {
        Collection<Integer> collection1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           collection1.add(i);
        }
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(2);
        collection2.add(1);
        collection2.add(4);
        collection1.retainAll(collection2);
        System.out.println(collection1);
    }
}