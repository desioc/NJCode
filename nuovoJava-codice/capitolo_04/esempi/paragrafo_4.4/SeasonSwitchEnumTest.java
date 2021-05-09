import java.time.Month;

public class SeasonSwitchEnumTest {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        if (args.length!=0) {
            month = Month.of(Integer.parseInt(args[0]));
        }
        String season;
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
            season = "winter";
            break;
            case MARCH:
            case APRIL:
            case MAY:
            season = "spring";
            break; //without this break we would have season = summer
            case JUNE:
            case JULY:
            case AUGUST:
            season = "summer";
            break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
            season = "autumn";
            break;
            default: //the default clause is optional
            season = "not identifiable";
        }
        System.out.println("The season is " + season);
    }
}