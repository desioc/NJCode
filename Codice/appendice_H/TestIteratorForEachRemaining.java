import java.util.*;

public class TestIteratorForEachRemaining {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung","Note 74"));
        smartphones.add(new Smartphone("Apple","IPhone 225"));
        smartphones.add(new Smartphone("Motorola","G55"));
        Iterator<Smartphone> iterator = smartphones.iterator();
        iterator.forEachRemaining(element-> {
            element.setMarca("Google");
        } );
        System.out.println(smartphones);

    }
}