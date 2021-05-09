public enum Numero {
    
    UNO("Asso"), 
    DUE("Due"), 
    TRE("Tre"), 
    QUATTRO("Quattro"), 
    CINQUE("Cinque"), 
    SEI("Sei"), 
    SETTE("Sette"), 
    OTTO("Otto"),  
    NOVE("Nove"), 
    DIECI("Dieci");
    
    String rappresentazione;
    
    Numero(String rappresentazione){
        this.rappresentazione = rappresentazione;
    }
    
    @Override
    public String toString(){
        return rappresentazione;
    }
}