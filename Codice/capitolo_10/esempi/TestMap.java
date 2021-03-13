import java.util.*;

public class TestMap {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0,"generics");
        map.put(1,"metadata");
        map.put(2,"enums");
        map.put(3,"varargs");
        for (int i = 0; i < 4; i++) {
            System.out.println(map.get(i));
        }
    }
}