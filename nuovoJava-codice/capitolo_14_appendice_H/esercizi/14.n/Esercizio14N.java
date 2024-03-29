import java.util.*;

public class Esercizio14N {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(1000000);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 2000000; ++i) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo = " + (endTime - startTime));
    }
}