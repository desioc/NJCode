import java.time.Month;

public class SeasonSwitchExpressionFallThroughEnumTest{
    public static void main(String args[]) {
        Month month = Month.APRIL;
        if (args.length!=0) {
            month = Month.of(Integer.parseInt(args[0]));
        }
        String season = switch(month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY: yield "winter";
            case MARCH, APRIL, MAY: yield "spring";
            case JUNE, JULY, AUGUST: yield "summer";
            case SEPTEMBER, OCTOBER, NOVEMBER: yield "autumn";
        };
        System.out.println("The season is " + season);
    }
}