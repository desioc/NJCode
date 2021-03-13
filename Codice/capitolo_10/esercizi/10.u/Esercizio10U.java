import java.util.List;
import java.util.Iterator;

public class Esercizio10U {
    public static <T extends Number> void cicla(List<T> list) {
        for (Iterator<T> i = list.iterator(); i.hasNext( ); ) {
            System.out.println(i.next());
        }
    }
}