public class Rubrica {
    public Contatto[] contatti;
    public Rubrica () {
        contatti = new Contatto[]{
            new Contatto("Claudio De Sio Cesari", "Via Java 13", "131313131313"),
            new Contatto("Stevie Wonder", "Via Musica 10", "1010101010"),
            new Contatto("Gennaro Capuozzo", "Piazza Quattro Giornate 1", "1111111111")
        };
    }
    
    public Contatto[] cercaContattiPerNome(String nome) {
        Contatto []contattiTrovati = new Contatto[contatti.length];
        for (int i = 0, j = 0;  i < contattiTrovati.length; i++) {
            if (contatti[i].nome.toUpperCase().contains(nome.toUpperCase())) {
                contattiTrovati[j] = contatti[i];
                j++;
            }
        }
        return contattiTrovati;
    }
}