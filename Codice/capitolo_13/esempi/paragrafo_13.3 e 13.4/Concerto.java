import java.util.function.Supplier;
public class Concerto {
    public static void main(String args[]) {
        Chitarrista chitarrista = new Chitarrista();
        Supplier<Chitarra> chitarraSupplier = ()-> new Chitarra("Ibanez");
        chitarrista.suonaChitarra(chitarraSupplier);
    }
}