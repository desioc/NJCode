public class DaCompletareImpl implements DaCompletare {
    private String descrizione;
    private String assegnataA = "da assegnare";
    public String descrizione() {
        return descrizione;
    }
    public String assegnataA() {
        return assegnataA;
    }
}

interface DaCompletare{}