public class FabbricaChitarraImpl  implements FabbricaChitarra {
    @Override
    public Chitarra getChitarra(String marca){
        return new Chitarra(marca);
    }
}