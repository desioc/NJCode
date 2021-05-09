public enum MiaEnumerazione2 implements Numeratore {
    UNO, DUE, TRE;
    @Override
    public void stampaIndice() {
            System.out.println("Indice: " + this.ordinal());
    }
}