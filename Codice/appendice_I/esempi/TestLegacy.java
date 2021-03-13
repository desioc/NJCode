import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class TestLegacy {
    public static void main(String args[]) {
        Instant instant = new Date().toInstant();
        Calendar calendar = Calendar.getInstance();
        instant = calendar.toInstant();
        Date date = Date.from(instant);
        GregorianCalendar gc = GregorianCalendar.from(ZonedDateTime.now());
        ZonedDateTime zdt = gc.toZonedDateTime();
        TimeZone tz = TimeZone.getDefault();
        ZoneId zi = tz.toZoneId();
    }
}