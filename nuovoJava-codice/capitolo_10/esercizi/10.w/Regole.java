import java.util.Comparator;

public class Regole implements Comparator<Segno> {
    @Override
    public int compare(Segno segno1, Segno segno2) {
        int risultato = 0;
        switch (segno1) {
            case CARTA: {
                if (segno2 == Segno.SASSO) {
                    risultato = 1;
                } else if (segno2 == Segno.FORBICI) {
                    risultato = -1;
                }
            }
            break;
            case SASSO: {
                if (segno2 == Segno.FORBICI) {
                    risultato = 1;
                } else if (segno2 == Segno.CARTA) {
                    risultato = -1;
                }
            }
            break;
            case FORBICI: {
                if (segno2 == Segno.CARTA) {
                    risultato = 1;
                } else if (segno2 == Segno.SASSO) {
                    risultato = -1;
                }
            }
            break;
            default: {
                risultato = 0;
            }
            break;

        }
        return risultato;
    }
}