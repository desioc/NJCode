import java.util.*;

public class TestListGet {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(3);
        list.add(25);
        list.add(7);
        list.add(74);
        int size = list.size();
        for (int i = 0; i < size; i++) {
           System.out.println(list.get(i));
        }
    }
}