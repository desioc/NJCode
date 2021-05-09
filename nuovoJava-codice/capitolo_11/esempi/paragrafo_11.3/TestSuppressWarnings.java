import java.util.*;

public class TestSuppressWarnings {
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String args[]) {
        List strings = new ArrayList<String>();
        strings.add("Lambda");
//        strings.add("Streams API");
//        strings.add("Date and Time API");
//        strings.add("JavaFX");
        Iterator<String> i = strings.iterator();
        while (i.hasNext()) {
            String string = i.next();
            System.out.println(string);
        }
    }
}