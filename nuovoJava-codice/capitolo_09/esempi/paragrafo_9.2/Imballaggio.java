public record Imballaggio(Misura misura, Pesabile... pesabili) implements Pesabile {
    public double getPeso() {
        double pesoComplessivo = misura.getPeso();
        for (Pesabile pesabile : pesabili) {
            pesoComplessivo += pesabile.getPeso();
        }
        return pesoComplessivo;
    }

    @Override
    public String toString() {
        String descrizione = "Imballaggio Misura: " + misura + "\n" ;
        descrizione += "Contenuto:\n" ;
        for (Pesabile pesabile : pesabili) {
            descrizione += "\t"+pesabile.toString()+ "\n" ;
        }
        return descrizione;
    }
}