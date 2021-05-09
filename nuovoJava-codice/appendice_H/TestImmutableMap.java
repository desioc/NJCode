import java.util.*;

public class TestImmutableMap {
    public static void main(String args[]) {
       /* Map<Integer,String> immutableMap = new HashMap<>();
        immutableMap.put(1,"a");
        immutableMap.put(2,"b");
        immutableMap.put(3,"c");
        immutableMap = Collections.unmodifiableMap(immutableMap); */

        //Map<Integer,String> immutableMap = Map.of(1,"a", 2,"b", 3,"c");
        /* Map <Integer, String> immutableMap = Map.ofEntries(
        Map.entry(1,"a"),
        Map.entry(2,"b"),
        Map.entry(3,"c"),
        //. . .
        Map.entry(21,"z")); */
        //Questa istruzione lancerà una IllegalArgumentException al runtime
        Map<Integer,String> immutableMap = Map.of(1, "a", 2, "b", 2, "c");

    }
}