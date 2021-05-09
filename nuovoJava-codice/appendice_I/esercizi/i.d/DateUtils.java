import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateUtils {

    public static long getIntervallo(Instant instant1, Instant instant2, 
      ChronoUnit chronoUnit) {
        return chronoUnit.between(instant1, instant2);
    }

    public static long getTempoPassato(Instant instant1, ChronoUnit chronoUnit) {
        return getIntervallo(instant1, Instant.now(), chronoUnit);
    }

    public static String oraEsatta() {
        LocalTime ora = LocalTime.now();
        String oraEsatta = (ora.getHour() + ":" + ora.getMinute() + " " 
            + ora.getSecond());
        return oraEsatta; 
    }
} 