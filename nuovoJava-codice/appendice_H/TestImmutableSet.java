import java.util.*;

public class TestImmutableSet {
    public static void main(String args[]) {
        /* Set<String> immutableSet = new HashSet<>();
        immutableSet.add("a");
        immutableSet.add("b");
        immutableSet.add("c");
        immutableSet = Collections.unmodifiableSet(immutableSet); */
        /* Set<String> immutableSet = new HashSet<>(Arrays.asList("a","b","c"));
        immutableSet = Collections.unmodifiableSet(immutableSet); */
        Set<String> immutableSet = Set.of("a", "b", "c");
        //Questa istruzione lancerà una java.lang.UnsupportedOperationException al runtime
        //immutableSet.add("d");
        //Questa istruzione lancerà una java.lang.IllegalArgumentException al runtime        
        //Set<String> immutableSet = Set.of("a", "b", "c");        
    }
}