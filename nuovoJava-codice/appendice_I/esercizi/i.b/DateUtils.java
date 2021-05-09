import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    public static long getIntervallo(LocalDateTime ldt1, LocalDateTime ldt2, ChronoUnit chronoUnit) {
        return chronoUnit.between(ldt1, ldt2);
    }
}