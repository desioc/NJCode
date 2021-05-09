import java.util.List;

public class PolilineaNonValidaException extends Exception {
    public PolilineaNonValidaException (List<Segmento> segmenti) {
        super(segmenti.size() < 2 ? "Una polilinea deve essere costituita da almeno 2 segmenti"
        : "Questi segmenti " + segmenti + " non costituiscono una polilinea");
    }
        
    public String toString() {
        return "Polilinea non valida:\n" + getMessage();
    }
}