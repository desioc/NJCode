package rubrica.dati;
import rubrica.util.Contatore;
import java.io.Serializable;

public abstract class Entita implements Dato, Identificabile, Serializable {
    private int id;

    public Entita () {
        setId(Contatore.dammiNumeroSeriale());
    }
    private void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}