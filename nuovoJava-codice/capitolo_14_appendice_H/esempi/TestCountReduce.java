import java.util.*;

public class TestCountReduce {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        long count = smartphones.stream().filter(s -> s.getMarca().equals("Samsung")).count();
        System.out.println(count);
        long prezzoTotale = smartphones.stream().filter(s -> s.getMarca().equals("Samsung")).map(Smartphone::getPrezzo).reduce(0, (x,y) -> x+y);
//        long prezzoTotale = smartphones.stream() .filter(s -> s.getMarca().equals("Samsung")) .map(Smartphone::getPrezzo).reduce(0, Integer::sum);

        System.out.println(prezzoTotale);        
    }

    public static Collection<Smartphone> getSmartphones() {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung","Note 74", 1620));
        smartphones.add(new Smartphone("Apple","Iphone 55",2721));
        smartphones.add(new Smartphone("Motorola","G55",1700));
        smartphones.add(new Smartphone("Samsung","S 99", 700));
        smartphones.add(new Smartphone("Samsung","J46", 925));
        smartphones.add(new Smartphone("Samsung","A27", 610));
        return smartphones;
    }
}