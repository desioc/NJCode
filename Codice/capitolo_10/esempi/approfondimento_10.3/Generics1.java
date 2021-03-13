import java.util.*;

public class Generics1 {
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
    public static List<String> getListOfMapValues (Map<Integer, String> map) {
        List <String> list = new ArrayList <String>();
        for (int i = 0; i < map.size(); i++) {
            list.add((String)map.get(i));
        }
        return list;
    }
}