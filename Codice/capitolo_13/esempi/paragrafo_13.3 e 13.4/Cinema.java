import java.util.function.*;
public class Cinema {
    public static UnaryOperator<ProgrammazioneFilm> componiCambi(UnaryOperator<ProgrammazioneFilm> op1, UnaryOperator<ProgrammazioneFilm> op2) {
        return x->op2.apply(op1.apply(x));
    }
    
    public static ProgrammazioneFilm cambiaProgrammazione(ProgrammazioneFilm pf, UnaryOperator<ProgrammazioneFilm> op) {
        return op.apply(pf);
    }
}