public class Dipendente {
    private String nome;
    private int stipendio;
    private int matricola;
    private String dataDiNascita;
    private String dataDiAssunzione;

    public void setDataDiAssunzione(String dataDiAssunzione) {
        this.dataDiAssunzione = dataDiAssunzione;
    }

    public String getDataDiAssunzione() {
        return dataDiAssunzione;
    }


    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }


    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public int getStipendio() {
        return stipendio;
    }
}