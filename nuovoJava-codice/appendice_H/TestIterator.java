import java.util.*;

public class TestIterator {
    public static void main(String args[]) {
        Collection<String> progBands = new HashSet<>();
        progBands.add("Dream Theater");
        progBands.add("Ayreon");
        progBands.add("Pain Of Salvation");
        Iterator<String> iterator = progBands.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}