import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class TestAdjusters {
    public static void main(String args[]) {
        LocalDate oggi = LocalDate.now();
        System.out.printf("Prossima domenica : %s\n",oggi.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));

        System.out.printf("Postare il prossimo articolo sul blog il %s",oggi.with(new NextBlogPostAdjuster()));

    }

    static class NextBlogPostAdjuster implements TemporalAdjuster {
        public  Temporal adjustInto(Temporal input) {
            LocalDate data = LocalDate.from(input);
            LocalDate result = data.plusDays(4);
            DayOfWeek giornoDellaSettimana = result.getDayOfWeek();
            if (giornoDellaSettimana.equals(DayOfWeek.SUNDAY)) {
                result = result.plusDays(1);
            }
            return result;
        }
    }
}