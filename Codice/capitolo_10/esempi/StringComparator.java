import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare (String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        s1 = sb1.reverse().toString();
        s2 = sb2.reverse().toString();
        return s1.compareTo(s2);
    }
}