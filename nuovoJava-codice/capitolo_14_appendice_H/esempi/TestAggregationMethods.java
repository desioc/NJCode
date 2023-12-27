import java.util.*;
import java.util.stream.*;

public class TestAggregationMethods {
    public static void main(String args[]) {
        List<Canzone> canzoni = List.of(
            new Canzone("The Architect" , "Haken"),
            new Canzone("Supper's Ready" , "Genesis"),
            new Canzone("21st Century Schizoid Man" , "King Crimson"),
            new Canzone("Roundabout" , "Yes"),
            new Canzone("The Odyssey" , "Symphony X"),
            new Canzone("Machine Messiah" , "Yes"),
            new Canzone("Mood for A Day" , "Yes"));
        //canzoni.stream().filter(c -> "Yes".equals(c.artista())).forEach(c -> System.out.println(c.titolo()));
        //canzoni.stream().takeWhile(c -> c.titolo().contains("e")).forEach(c -> System.out.println(c.titolo()));
        //canzoni.stream().dropWhile(c -> c.titolo().contains("e")).forEach(c -> System.out.println(c.titolo()));
        List<Character> chars = List.of('C', 'A', 'B', 'A');
        //chars.stream().distinct().forEach(System.out::println);
        //chars.stream().dis+ c)).distinct()
        //   .forEach(c -> System.out.println("Elemento nello stream di output: " + c));tinct().sorted().forEach(System.out::println);
        //chars.stream().distinct().sorted((a,b) -> -(a.compareTo(b))).forEach(System.out::println);
        //chars.stream().distinct().mapToInt(c -> (int)c).forEach(System.out::println);
        //chars.stream().peek(c -> System.out.println("Elemento nello stream di input: " 
        Stream<Character> cStream = chars.stream()
            .peek(c -> System.out.println("Elemento nello stream di input: " + c))
            .distinct()
            .peek(c -> System.out.println("Elemento nello stream di output: " + c));

        //cStream.forEach(c -> System.out.println("Elemento nello stream di output: " + c));
        //canzoni.stream().map(t -> t.titolo().toUpperCase()).forEach(System.out::println);


        List<Canzone> before2000 = List.of(
            new Canzone("Supper's Ready" , "Genesis"),
            new Canzone("21st Century Schizoid Man" , "King Crimson"),
            new Canzone("Roundabout" , "Yes"),
            new Canzone("Machine Messiah" , "Yes"),
            new Canzone("Mood for A Day" , "Yes"));
        Playlist plBefore2000 = new Playlist(before2000);
        List<Canzone> after2000 = List.of(
            new Canzone("The Architect" , "Haken"),
            new Canzone("The Odyssey" , "Symphony X"),
            new Canzone("Shism" , "Tool"),
            new Canzone("Infinite Fire" , "Flying Colors"));
        Playlist plAfter2000 = new Playlist(after2000);
        List<Playlist> playlists = List.of(plBefore2000, plAfter2000);
        Stream<Canzone> songs = playlists.stream().flatMap(pl -> pl.canzoni().stream());
        //songs.forEach(System.out::println);
        //playlists.stream().peek(p -> System.out.println("Oggetto playlist:\n" + p)).flatMap(pl -> pl.canzoni().stream()).forEach(System.out::println);
    }
}