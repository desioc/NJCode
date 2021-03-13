import java.util.*;
import java.util.stream.Stream;

public class TestIntroStreams {
    public static void main(String args[]) {
        String [] arrayDiStringhe = {"The ","Human","Equation"};
        Stream <String> stringsStream1 = Stream.of(arrayDiStringhe);
        Stream <String> stringsStream2 = Stream.of("Take", "The", "Time");
        Stream<Double> randomDoubles = Stream.generate(Math::random);
        randomDoubles.forEach(System.out::println);
    }
}