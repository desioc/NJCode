public class Operazione<Integer, O extends Operatore> {
    
    private Integer operando1;
    private O operatore;
    private Integer operando2;   
    
    public Operazione(Integer operando1, O operatore, Integer operando2) {
        this.operando1 = operando1;
        this.operatore = operatore;
        this.operando2 = operando2;
    }
    
    public void stampa(){
        System.out.println(operando1  +  " " + operatore +  " " + operando2);
    }
}