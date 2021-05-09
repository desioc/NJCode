import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class TestDates {
    public static void main(String args[]) {
        YearMonth yearMonth = YearMonth.now();
        YearMonth leapFebruary = YearMonth.of(2012, Month.FEBRUARY);
        System.out.println("Quest'anno dura: "+ yearMonth.lengthOfYear() +" giorni");
        System.out.println("Il mese di Febbraio 2012 è durato "+ leapFebruary.lengthOfMonth() +" giorni"+ yearMonth.getMonth());
        LocalDate date = LocalDate.of(2004, Month.NOVEMBER, 12);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        MonthDay md = MonthDay.of(Month.JULY, 29);
        LocalDate ld = md.atYear(2012);
        System.out.println(ld);
        Year year = Year.of(2014);
        System.out.println(year);
    }
}