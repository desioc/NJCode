import java.util.*;
import java.util.stream.*;

public class TestStreamCreation {
    public static void main(String args[]) {
        String [] arrayDiStringhe = {"The ","Human","Equation"};
        Stream <String> stringsStream1 = Stream.of(arrayDiStringhe);
        Stream <String> stringsStream2 = Stream.of("Take", "The", "Time");
        Stream<Double> randomDoubles = Stream.generate(Math::random);
        randomDoubles.limit(5).forEach(System.out::println); // stampa infiniti numeri senza il limit
//        Stream<Integer> pari = Stream.iterate(2, n -> n <= 10, n -> n + 2);
        Stream<Integer> pari = Stream.iterate(2, n -> n + 2).limit(5);
        pari.forEach(System.out::println);
        System.out.println();
        Stream<Integer> mult5 = Stream.iterate(0, n -> n + 10).skip(5).limit(6);
        mult5.forEach(System.out::println);
        Stream<String> strings = Arrays.stream(new String[]{"Diego","Gio'","Miki"});
        strings.forEach(System.out::println);
        DoubleStream doubles = Arrays.stream(new double[]{1.1, 2.2, 3.3});
        doubles.forEach(System.out::println);
    }
}