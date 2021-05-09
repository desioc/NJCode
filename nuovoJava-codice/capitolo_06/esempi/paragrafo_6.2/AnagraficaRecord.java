public record AnagraficaRecord (String nome, String cognome) {
    public void stampaAnagrafica() {
        System.out.println(nome + " " + cognome);
    }
}