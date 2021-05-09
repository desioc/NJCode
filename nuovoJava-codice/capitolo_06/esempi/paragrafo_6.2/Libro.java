public class Libro {
    private String titolo;
    private String autore;
    
    public Libro(String titolo, String autore) {
        this(titolo); // Chiamata al secondo costruttore
        setAutore(autore);
    }

    public Libro(String titolo) {
        this.titolo = titolo;
    } 
    
    public void setAutore(String autore) {
        this.autore = autore;
    }
    // Metodi setter e getter omessi
}


/* prima versione

public class Libro {
    //...
    public Libro() {
        System.out.println("Costruito un Libro!");
    }
} */