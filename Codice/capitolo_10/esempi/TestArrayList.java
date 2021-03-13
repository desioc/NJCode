import java.util.*;

public class TestArrayList {
    public static void main(String args[]) {
        List<String> strings = new ArrayList<String>( );
        strings.add("Autoboxing & Auto-Unboxing");
        strings.add("Generics");
        strings.add("Static imports");
        strings.add("Enhanced for loop");
        Iterator <String> i = strings.iterator();
        while (i.hasNext()) {
            String string = i.next();
            System.out.println(string);
        }
    }
}