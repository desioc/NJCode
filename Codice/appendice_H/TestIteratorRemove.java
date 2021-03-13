import java.util.*;

public class TestIteratorRemove {
    public static void main(String args[]) {
        Collection<String> progBands = new HashSet<>();
        progBands.add("Dream Theater");
        progBands.add("Ayreon");
        progBands.add("Pain Of Salvation");
        Iterator<String> iterator = progBands.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Ayreon")) {
                iterator.remove();
            }
        }
        System.out.println(progBands);
    }
}