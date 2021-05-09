public class Stampante<T extends Tecnologia> {
    
    private T tecnologia;
    
    public Stampante(T tecnologia){
        this.tecnologia = tecnologia;
    }
    
    public void stampa(){
        tecnologia.stampa();
    }
    
}