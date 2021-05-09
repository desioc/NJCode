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
  public void setDati(String nome, int matricola) {
    setNome(nome);
    setMatricola(matricola);
  }

}
