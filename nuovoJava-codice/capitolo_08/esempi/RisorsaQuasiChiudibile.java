public class RisorsaQuasiChiudibile extends RisorsaChiudibile {
    private Number number;
    @Override
    public void close() {
        super.close();
        number = Double.valueOf(.1);   
        Integer integer = (Integer)number;
    }
    
    public void lanciaEccezione() {
        number = Integer.valueOf("Qualcosa è andato storto");
    }
    
    @Override
    public String toString() {
        return "RisorsaQuasiChiudibile";
    }
}