
import java.util.Arrays;

public class TestIntegerComparator {
    public static void main(String args[]) {
        Integer []array = {1942, 1947, 1971, 1984, 1976, 1974};
        Arrays.sort(array, new IntegerComparator());
        for (int intero : array) {
            System.out.println(intero);
        }
    }
}
