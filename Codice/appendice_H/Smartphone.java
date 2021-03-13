public class Smartphone {
    private String modello;
    private String marca;
    private int prezzo;

    public Smartphone (String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }
    
    public Smartphone (String marca, String modello, int prezzo) {
        this(marca, modello);
        this.prezzo = prezzo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }
 
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getPrezzo() {
        return prezzo;
    }
    public String toString() {
        return marca +" "+ modello;
    }
}