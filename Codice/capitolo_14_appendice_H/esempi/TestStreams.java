import java.util.*;

public class TestStreams {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung", "Note 74"));
        smartphones.add(new Smartphone("Apple", "Iphone 225"));
        smartphones.add(new Smartphone("HTC", "One M167"));
        smartphones.forEach(s->System.out.println(s));
//        smartphones.stream().filter(s->"Samsung".equals(s.getMarca())).forEach(s->System.out.println(s));
//        smartphones.parallelStream().filter(s->"Samsung".equals(s.getMarca())).forEach(s->System.out.println(s));
    }
}


