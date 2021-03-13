import java.util.*;
public class VectorTest {
    public static void main(String args[]) {
        Vector<String> list = new Vector<>(10,10);
        for (int i = 0; i < 11; i++) {
            list.add("1");
        }
        System.out.println("Capacità = " + list.capacity());
        for (int i = 0; i < 11; i++) {
            list.add("1");
        }
        System.out.println("Capacità = " + list.capacity());
    }
}