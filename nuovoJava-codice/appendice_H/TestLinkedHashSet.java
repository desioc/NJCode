import java.util.*;

public class TestLinkedHashSet {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("b");
        Iterator<String> iter = set.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}