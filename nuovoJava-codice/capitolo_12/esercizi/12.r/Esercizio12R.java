import java.util.Date;

public final class Esercizio12R {
    
    private final Integer intero;

    private final Date date;

    public Esercizio12R (Integer intero, Date date){
        this.intero = intero;
        this.date = (Date)date.clone();
    }

    public final Date getStringBuilder() {
        return (Date)date.clone();
    }

    public final Integer getIntero() {
        return intero;
    }
}