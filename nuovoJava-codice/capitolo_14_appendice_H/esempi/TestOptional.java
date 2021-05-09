import java.util.*;

public class TestOptional {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        Optional<Smartphone> found = smartphones.stream().filter(s -> s.getMarca().equals("Samsung")).findFirst();
        System.out.println(found.orElse(new Smartphone("Samsung","Note 3")));
    }

    public static Collection<Smartphone> getSmartphones() {
        Collection<Smartphone> smartphones = new HashSet<>();
    /* smartphones.add(new Smartphone("Samsung","Note 3", 620)); */
        smartphones.add(new Smartphone("Apple","Iphone 55",721));
        smartphones.add(new Smartphone("HTC","One M8",700));
       /*   smartphones.add(new Smartphone("Samsung","S 5", 700));
      smartphones.add(new Smartphone("Samsung","Ace", 125));
        smartphones.add(new Smartphone("Samsung","Grand", 310));
        smartphones.add(new Smartphone("Samsung","Young", 80));
        smartphones.add(new Smartphone("Samsung","Express", 70)); */
        return smartphones;
    }
}