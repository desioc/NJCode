import java.util.*;

public class TestIteratorForEachArray {
    public static void main(String args[]) {
        Collection<String> progBands = new HashSet<>();
        progBands.add("Dream Theater");
        progBands.add("Ayreon");
        progBands.add("Pain Of Salvation");
        String [] progBandsArray = progBands.toArray(new String[0]);
        for (String progBand : progBandsArray) {
            System.out.println(progBand);
        }
    }
}