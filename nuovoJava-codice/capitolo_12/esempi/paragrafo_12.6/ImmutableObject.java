import java.util.*;

public class ImmutableObject {
    private final int integer; // variabile d’istanza primitiva
    private final String string; // variabile d’istanza complessa immutabile
    private final Calendar calendar; // variabile d’istanza complessa 
    // Costruttore che prende le variabili dall’esterno
    public ImmutableObject (int integer, String string, Calendar calendar) {
        this.integer = integer;
        this.string = string;
        // segue punto 3
        this.calendar = (Calendar)calendar.clone();
    }
    //Questo metodo segue il punto 4
    public Calendar getDate(){
        return (Calendar)calendar.clone();
    }
    //Metodo di test
    public void stampaCalendar(){
        System.out.println(calendar);
    }
}