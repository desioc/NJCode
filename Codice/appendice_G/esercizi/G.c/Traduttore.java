import java.util.Locale;
import java.util.ResourceBundle;

public class Traduttore {

    private LinguaEnum lingua;
    
    private ResourceBundle resources;
    
    public Traduttore (LinguaEnum lingua){
        this.lingua = lingua;
        String chiaveLingua = lingua.getChiave();
        Locale locale = new Locale(chiaveLingua);
        resources = ResourceBundle.getBundle("risorse.vocabolario", locale);
    }

    public String traduci(ParoleEnum testo) {
        String traduzione = resources.getString(testo.getChiave());
        return traduzione;
    }

    public void setLingua(LinguaEnum lingua) {
        this.lingua = lingua;
    }

    public LinguaEnum getLingua() {
        return lingua;
    }
}