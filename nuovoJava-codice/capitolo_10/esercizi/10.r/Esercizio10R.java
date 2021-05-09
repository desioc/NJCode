import java.util.List;
import java.util.ArrayList;

public class Esercizio10R<T> {
    
    private <L extends List<Integer>> Integer sumElements(L list) {
        int size = list.size();
        int result = 0;
        for (int i = 0; i < size; i++) {
            Integer item = list.get(i);
            result+=item;
        }
        return result;
    }

    public static void main(String args[]) {
        Esercizio10R<Void> e = new Esercizio10R<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(6);
        a.add(10);
        a.add(24);
        a.add(17);
        System.out.println("La somma degli elementi della lista è "+ e.sumElements(a));
    }
}