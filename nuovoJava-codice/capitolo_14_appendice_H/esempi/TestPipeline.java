import java.util.*;

public class TestPipeline {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        double prezzoTotale = 0;
        int numeroSamsung = 0;
        for (Smartphone smartphone : smartphones) {
            if (smartphone.getMarca().equals("Samsung")) {
                numeroSamsung++;
                prezzoTotale += smartphone.getPrezzo();
            }
        }
        double average = prezzoTotale/numeroSamsung;
        
        /* double average = smartphones
            .stream()
            .filter(s -> s.getMarca().equals("Samsung"))
            .mapToDouble(Smartphone::getPrezzo)
            .average()
            .getAsDouble(); */
        System.out.println(average);
    }

    public static Collection<Smartphone> getSmartphones() {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung" , "Note 3" , 620));
        smartphones.add(new Smartphone("Apple" , "Iphone 55" ,721));
        smartphones.add(new Smartphone("HTC" , "One M8" ,700));
        smartphones.add(new Smartphone("Samsung" , "S 5" , 700));
        smartphones.add(new Smartphone("Samsung" , "Ace" , 125));
        smartphones.add(new Smartphone("Samsung" , "Grand" , 310));
        smartphones.add(new Smartphone("Samsung" , "Young" , 80));
        smartphones.add(new Smartphone("Samsung" , "Express" , 70));
        return smartphones;
    }
}