public class TestConstructorReference {
    public static void main(String args[]) {
//        FabbricaChitarra fabbricaChitarra = (marca) -> { return new Chitarra(marca); };
        FabbricaChitarra fabbricaChitarra = Chitarra::new;
        Chitarra chitarra1 = fabbricaChitarra.getChitarra("Fender");
        Chitarra chitarra2 = fabbricaChitarra.getChitarra("Ibanez");
        Chitarra chitarra3 = fabbricaChitarra.getChitarra("Gibson");
    }
}