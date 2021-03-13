public class Impiegato extends Persona { //Ereditarietà
    private int matricola; 

    public void setDati(String nome, int matricola) {
      setNome(nome); //Riuso ed ereditarietà
      setMatricola(matricola); //Riuso
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola; //incapsulamento
    }

    public int getMatricola() {
      return matricola; //incapsulamento
    }

    public String dammiDettagli() {
         //Riuso, incapsulamento ed ereditarietà
      return getNome() + ", matricola: " + getMatricola();
    }
  }
