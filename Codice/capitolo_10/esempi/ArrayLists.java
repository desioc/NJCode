import java.util.*;

public class ArrayLists {
    public static void main(String args[]) {
        List<String> strings = new ArrayList<>();
        strings.add("è possibile aggiungere String");
       // strings.add(new Date());
        for (int i = 0; i < 2; i++) {
           System.out.println(strings.get(i));
        }
    }
}