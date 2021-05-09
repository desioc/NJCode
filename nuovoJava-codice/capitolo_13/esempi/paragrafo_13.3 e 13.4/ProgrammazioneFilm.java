import java.time.*;

public class ProgrammazioneFilm {

    private Film film;
    private LocalDate data;
    private LocalTime orario;
    
    public ProgrammazioneFilm (Film film, LocalDate data, LocalTime orario){
        this.film = film;
        this.data = data;
        this.orario = orario;
    }
    
    public void setOrario(LocalTime orario) {
        this.orario = orario;
    }

    public LocalTime getOrario() {
        return orario;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }
    
    public String toString(){
        return film.getNome() + " verrà proiettato il " + getData() + " alle " + getOrario();
    }
}