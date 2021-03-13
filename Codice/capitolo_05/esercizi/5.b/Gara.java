public class Gara {
    private String nome;
    private String risultato;
    private Auto griglia [];

    public Gara(String nome) {
        setNome(nome);
        setRisultato("Corsa non terminata");
        creaGrigliaDiPartenza();
    }

    public void creaGrigliaDiPartenza() {
        Pilota uno = new Pilota("Pippo");
        Pilota due = new Pilota("Pluto");
        Pilota tre = new Pilota("Topolino");
        Pilota quattro = new Pilota("Paperino");
        Auto autoNumeroUno = new Auto("Ferrari", uno);
        Auto autoNumeroDue = new Auto("Renault", due);
        Auto autoNumeroTre = new Auto("BMW", tre);
        Auto autoNumeroQuattro = new Auto("Mercedes",
        quattro);
        griglia = new Auto[4];
        griglia[0] = autoNumeroUno;
        griglia[1] =  autoNumeroDue;
        griglia[2] = autoNumeroTre;
        griglia[3] =  autoNumeroQuattro;
    }

    public void corriGara() {
        int numeroVincente = (int)(Math.random()*4);
        Auto vincitore = griglia[numeroVincente];
        String risultato = vincitore.dammiDettagli();
        setRisultato(risultato);
    }

    public void setRisultato(String vincitore) {
        this.risultato = "Il vincitore di " + this.getNome()
        + ": " + vincitore;
    }

    public String getRisultato() {
        return risultato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}