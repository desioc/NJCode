import java.util.*;

public class TestHashSet {
    public static void main(String args[]) {
        HashSet <String>set = new HashSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("b");
        set.add(null);
        set.add(null);
        for (String string : set) {
            System.out.println(string);            
        }
    }
}