import java.time.Month;

public class SeasonSwitchStatementArrowEnumTest {
    public static void main(String args[]) {
        Month month = Month.APRIL;
        if (args.length!=0) {
            month = Month.of(Integer.parseInt(args[0]));
        }
        String season = null;
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> season = "winter";
                                                                                /* {
                                                                                        season = "winter";
                                                                                        System.out.println("OK");
                                                                                    } */

            case MARCH, APRIL, MAY -> season = "spring";
            case JUNE, JULY, AUGUST -> season = "summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> season = "autumn";
        }
        System.out.println("The season is " + season);
    }
}