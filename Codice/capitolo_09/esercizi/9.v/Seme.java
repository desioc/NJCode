public enum Seme {
    
    COPPE, 
    BASTONI, 
    DENARI, 
    SPADE;
    
    String rappresentazione;
        
    public String toString() {
        return rendiMaiuscolo(this.name());
    }
    
    private String rendiMaiuscolo(String stringa) {
        //rendiamo minuscola la stringa
        String minuscolo = stringa.toLowerCase();
        //recuperiamo la prima lettera della stringa
        String iniziale = minuscolo.substring(0,1);
        //rendiamo maiuscola la prima lettera
        String inizialeMaiuscola = iniziale.toUpperCase();
        //ritorniamo la concatenazione tra la lettera maiuscola
        //e il resto della stringa minuscola
        return  inizialeMaiuscola + minuscolo.substring(1);
    }
}