package rubrica.dati;
import rubrica.util.Contatore;

public abstract class Entita implements Dato, Identificabile {
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