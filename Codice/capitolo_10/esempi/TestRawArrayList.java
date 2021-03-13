import java.util.*;

public class TestRawArrayList {
    public static void main(String args[]) {
        List strings = new ArrayList();
        strings.add("Lambda");
        strings.add("Streams API");
        strings.add("Date and Time API");
        strings.add("JavaFX");
        Iterator  i = strings.iterator();
        while (i.hasNext()) {
            String string = (String)i.next();
            System.out.println(string);
        }
    }
}