import java.util.function.*;
import java.time.*;
import java.time.temporal.*;

public class TestCinema {
    public static void main(String args[]) {
        UnaryOperator<ProgrammazioneFilm> ritardaDiUnOra= p-> {
            LocalTime orario = p.getOrario();
            orario = orario.plus(1, ChronoUnit.HOURS);
            p.setOrario(orario);
            return p;
        } ;
        UnaryOperator<ProgrammazioneFilm> ritardaDiUnGiorno= p-> {
            p.setData(p.getData().plus(1, ChronoUnit.DAYS));
            return p;
        } ;
        
        Film shining = new Film("Shining", "Thriller", 5);
        ProgrammazioneFilm programmazioneShining = new ProgrammazioneFilm(shining, LocalDate.of(2021, 5, 29), LocalTime.of(21,0));
        UnaryOperator<ProgrammazioneFilm> ritardaDiUnOraEUnGiorno = Cinema.componiCambi(ritardaDiUnOra, ritardaDiUnGiorno);
        System.out.println(Cinema.cambiaProgrammazione(programmazioneShining, ritardaDiUnOraEUnGiorno));
        
    }
}