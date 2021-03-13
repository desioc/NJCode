import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class TestInstant {
    public static void main(String args[]) {
        Instant traDieciMinuti = Instant.now().plus(10, ChronoUnit.MINUTES);
        System.out.println(traDieciMinuti);
        Instant now = Instant.now();
        boolean b = now.isAfter(Instant.EPOCH);
        System.out.println(b);
        Duration  d = Duration.between(Instant.EPOCH, Instant.now());
        System.out.println(d);
        Instant nascita = Instant.parse("2004-04-14T07:00:00.00Z");
        long giorniDallaNascita = nascita.until(Instant.now(), ChronoUnit.DAYS);
        System.out.println("giorniDallaNascita:"+ giorniDallaNascita);
        Duration duration = Duration.between(nascita, Instant.now());
        System.out.println(duration.toDays());
    }
}