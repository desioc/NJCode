public class Libro {
    public String titolo;
    public String autore;
    public String editore;
    
    public Libro (String t, String a, String e) {
        titolo = t;
        autore = a;
        editore = e;
    }

    public void stampaDettagli() {
        System.out.println(titolo);
        System.out.println(autore);
        System.out.println(editore);
        System.out.println();
    }
}