import java.time.Month;

public class SeasonSwitchExpressionEnumTest {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        if (args.length!=0) {
            month = Month.of(Integer.parseInt(args[0]));
        }
        String season = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY -> "winter" ;
            case MARCH, APRIL, MAY -> "spring" ;
            case JUNE, JULY, AUGUST -> "summer" ;
            case SEPTEMBER, OCTOBER, NOVEMBER -> "autumn" ;
        } ; 
        /* MIX
            String season = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY: yield "winter" ;
            case MARCH, APRIL, MAY: yield "spring" ;
            case JUNE, JULY, AUGUST: yield "summer" ;
            case SEPTEMBER, OCTOBER, NOVEMBER -> "autumn" ;
        } ; */

        System.out.println("The season is " + season);
    }
}