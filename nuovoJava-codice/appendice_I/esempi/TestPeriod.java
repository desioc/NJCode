import java.time.*;
import java.time.temporal.*;
import java.util.*;

public class TestPeriod {
    public static void main(String args[]) {
        LocalDate mioCompleanno = LocalDate.of(1974,1,26);
        LocalDate oggi = LocalDate.now();
        Period period = Period.between(mioCompleanno, oggi);
        System.out.printf("Hai %s anni, %s mesi e %s giorni", period.getYears(), period.getMonths(), period.getDays());
    }
}