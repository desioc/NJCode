public record ClienteRecord (String indirizzo, String telefono) extends Anagrafica {
    public void stampaAnagraficaCliente() {
        super.stampaAnagrafica();
        System.out.println(indirizzo + "\nTel:" + telefono);
    }
}