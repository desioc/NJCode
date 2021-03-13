public class Auto {
    private String scuderia;
    private Pilota pilota;

    public Auto (String scuderia, Pilota pilota) {
      setScuderia(scuderia);
      setPilota(pilota);
    }
    public void setScuderia(String scuderia) {
      this.scuderia = scuderia;
    }
    public String getScuderia() {
      return scuderia;
    }
    public void setPilota(Pilota pilota) {
      this.pilota = pilota;
    }
    public Pilota getPilota() {
      return pilota;
    }
    public String dammiDettagli() {
      return getPilota().getNome() + " su "+ getScuderia();
    }
  }
