public enum LinguaEnum {

    ITALIANO("it", "Italiano"), INGLESE("en", "Inglese");

    String chiave;

    String descrizione;

    LinguaEnum(String chiave, String descrizione) {
        this.chiave = chiave;
        this.descrizione = descrizione;
    }

    public String getChiave() {
        return chiave;
    }
    
    public String toString() {
        return descrizione;
    }

}