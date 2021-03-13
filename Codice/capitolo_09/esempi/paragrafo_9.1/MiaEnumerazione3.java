public enum MiaEnumerazione3 {
    ZERO(), UNO(1), DUE(2), TRE(3);
    private int valore;
    private MiaEnumerazione3() {
    }
    MiaEnumerazione3(int valore) {
      setValore(valore);
    }
    public void setValore(int valore){
      this.valore = valore;
    }
    public int getValore(){
      return this.valore;
    }
    @Override
    public String toString() {
      return ""+valore;
    }
}