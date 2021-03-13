import java.util.*;

public class TestIteratorForEach {
    public static void main(String args[]) {
        Collection<String> progBands = new HashSet<>();
        progBands.add("Dream Theater");
        progBands.add("Ayreon");
        progBands.add("Pain Of Salvation");
        for (String progBand : progBands) {
            System.out.println(progBand);
        }
    }
}