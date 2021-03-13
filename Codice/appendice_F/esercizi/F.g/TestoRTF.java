public class TestoRTF implements Cloneable {
    String testo;
    Font carattere;
    boolean sottolineato;
    
    public TestoRTF (String testo, Font carattere, boolean sottolineato){
        this.testo = testo;
        this.carattere = carattere;
        this.sottolineato = sottolineato;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String toString(){
        return "Testo = " + testo + ", carattere = " + carattere + ",  sottolineato = " + sottolineato;
    }
    
    
}