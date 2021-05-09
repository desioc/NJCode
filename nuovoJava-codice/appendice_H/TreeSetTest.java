import java.util.*;
public class TreeSetTest {
    public static void main(String args[]) {
//        Set<String> set = new TreeSet<>();
        Set<String> set = new TreeSet<>((x,y)-> { return -(x.compareTo(y)); });
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("b");
        set.forEach(System.out::println); 
    }
}