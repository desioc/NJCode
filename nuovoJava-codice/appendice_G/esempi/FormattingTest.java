import java.text.*;
import java.util.*;
public class FormattingTest {
    public static void main(String args[]) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df.format(date));


        Locale locale = Locale.ITALY;
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String s = formatter.format(new Date());
        s = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale).format(new Date());
        System.out.println(s);

        DateFormat formatter2 = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
        String s2 = formatter2.format(new Date());
        s2 = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale).format(new Date());
        System.out.println(s);

        double number = 55667788.12345;
        Locale localeUsa = Locale.US;
        Locale localeIta = Locale.ITALY;
        NumberFormat usaFormat = NumberFormat.getInstance(localeUsa);
        String usaNumber = usaFormat.format(number);
        System.out.println(localeUsa.getDisplayCountry() + " " + usaNumber);
        NumberFormat itaFormat = NumberFormat.getInstance(localeIta);
        String itaNumber = itaFormat.format(number);
        System.out.println(localeIta.getDisplayCountry() + " " + itaNumber);
    }
}