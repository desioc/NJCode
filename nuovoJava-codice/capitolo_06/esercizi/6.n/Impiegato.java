public class Impiegato extends Persona {

  private int matricola;

  public void setMatricola(int matricola) {
    this.matricola = matricola;
  }

  public int getMatricola () {
    return this.matricola;
  }  

  public String getDati() {
    return getNome() + "\nnumero" + getMatricola();
  }
}
