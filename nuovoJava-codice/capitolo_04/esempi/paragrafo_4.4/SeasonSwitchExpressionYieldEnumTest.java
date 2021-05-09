import java.time.Month;

public class SeasonSwitchExpressionYieldEnumTest{
    public static void main(String args[]) {
        Month month = Month.APRIL;
        if (args.length!=0) {
            month = Month.of(Integer.parseInt(args[0]));
        }
        String season = switch(month) {
            case DECEMBER, JANUARY, FEBRUARY: yield "winter";
            case MARCH, APRIL, MAY: yield "spring";
            case JUNE, JULY, AUGUST: yield "summer";
            case SEPTEMBER, OCTOBER, NOVEMBER: yield "autumn";
            default: break; //the default clause is optional
        };
        System.out.println("The season is " + season);
    }
}