public class Cliente extends Anagrafica {
    private String indirizzo, telefono;

    public Cliente (String nome, String cognome, String indirizzo, String telefono){
        super(nome, cognome);
        setIndirizzo(indirizzo);
        setTelefono(telefono);
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }


    public void stampaAnagraficaCliente() {
        super.stampaAnagrafica();
        System.out.println(indirizzo + "\nTel:" + telefono);
    }
    //accessor e mutator methods (set e get)
}