public enum Operatore {
    
    SOMMA("+"), SOTTRAZIONE("-"), MOLTIPLICAZIONE("X"), DIVISIONE(":");

    String segno;

    Operatore(String segno) {
        this.segno = segno;
    }
    
    public String toString(){
        return segno;
    }
}