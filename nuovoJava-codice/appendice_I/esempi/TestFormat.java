import java.time.*;
import java.time.format.*;
import java.util.*;

public class TestFormat {
    public static void main(String args[]) {
        String data ="1942-07-22";
        LocalDate localDate = LocalDate.parse(data, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now()));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter dateTimeFormatter  =   DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        dateTimeFormatter = dateTimeFormatter.withLocale(Locale.FRENCH);
        System.out.println(dateTimeFormatter.format(LocalDate.now()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/dd/yy  hh:mm a");
        String formattedDate = formatter.format(LocalDateTime.now());
        System.out.printf(formattedDate);
    }
}