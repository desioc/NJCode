import java.util.Date;

public class Esercizio12RNonImmutabile {
    
    private Integer intero;

    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setIntero(Integer intero) {
        this.intero = intero;
    }

    public Integer getIntero() {
        return intero;
    }
}