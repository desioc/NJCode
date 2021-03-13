import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestDateUtils {

    private static final String FORMATO_DATA = "MM/dd/yy  hh:mm a";

    public static void main(String args[]) {
        final String oraEsatta = DateUtils.oraEsatta();
        System.out.println("Sono le: " + oraEsatta);
        Instant duemila = Instant.parse("2000-01-01T00:00:00.00Z");
        Instant duemiladieci = Instant.parse("2010-01-01T00:00:00.00Z");
        long intervalloInGiorni = DateUtils.getIntervallo(
          duemila, duemiladieci, ChronoUnit.DAYS);
        System.out.println("Dal primo gennaio 2000 al primo gennaio 2010 "
          + "sono passati " + intervalloInGiorni + " giorni");
        final long tempoPassatoInMinuti = 
          DateUtils.getTempoPassato(duemila, ChronoUnit.MINUTES);
        System.out.println("Dal primo gennaio 2010 ad oggi sono passati "
          + tempoPassatoInMinuti
          + " minuti");
        LocalDateTime localDateTime = LocalDateTime.now();
        final String dataFormattata = 
          DateUtils.formattaData(localDateTime, FORMATO_DATA);
        System.out.println("Data formattata: " + dataFormattata);
        LocalDate localDate = 
          DateUtils.analizzaData(dataFormattata, FORMATO_DATA);
        System.out.println(localDate);
        System.out.println("Lanciamo un'eccezione!");
        localDate = DateUtils.analizzaData(dataFormattata, "ABC");
    }
}