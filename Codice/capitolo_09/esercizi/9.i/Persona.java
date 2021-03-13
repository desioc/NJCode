public record Persona(String nome, String cognome, String dataDiNascita, String professione, String indirizzo) {

    @Override
    public String toString() {
        String string = "Nome: \t\t\t" + nome();
        string += "\nCognome: \t\t" + cognome();
        string += "\nProfessione: \t\t" + professione();
        string += "\nData di Nascita: \t" + dataDiNascita();
        string += "\nIndirizzo: \t\t" + indirizzo();
        return string;
    }

}