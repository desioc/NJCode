import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class TestDatesAndTimes {
    public static void main(String args[]) {
        System.out.println("Ora: "+ LocalTime.now());
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime);
    }
}