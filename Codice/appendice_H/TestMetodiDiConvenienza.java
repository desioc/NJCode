import java.util.*;

public class TestMetodiDiConvenienza {
    public static void main(String args[]) {
        Collection<Object> collection = new ArrayList<>();
        Object oggettoDaRimuovere = new Object();
        collection.add(oggettoDaRimuovere);
        collection.add(null);
        collection.add(null);
        collection.removeAll(Collections.singleton(oggettoDaRimuovere));
        System.out.println(collection);
        collection.removeAll(Collections.singleton(null));    
        System.out.println(collection);
    }
}