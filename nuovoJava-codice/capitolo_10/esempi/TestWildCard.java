import java.util.*;

public class TestWildCard {
    public void print(ArrayList <?> al) {
        Iterator<?> i = al.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            System.out.println(o);
        }
    }

    public void printUpper(List <? extends Number> list) {
        for (Iterator<? extends Number> i = list.iterator(); i.hasNext( ); ) {
            System.out.println(i.next());
        }
    }

    public static void riempiLista(List<? super Integer> list) {
        int size = list.size();
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("Unbounded Wildcard");
        list.add("Upper Bounded Wildcard");
        list.add("Lower BoundedWildcard");
        TestWildCard twd = new TestWildCard();
        twd.print(list);
        twd.printUpper(list);
        twd.riempiLista(list);
    }
}