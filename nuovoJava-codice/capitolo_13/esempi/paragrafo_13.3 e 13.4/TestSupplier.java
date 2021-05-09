import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String args[]) {
        Chitarrista chitarrista = new Chitarrista();
        Supplier<Chitarra> chitarraSupplier = ()-> new Chitarra("Ibanez");
        chitarrista.suonaChitarra(chitarraSupplier);

    }
}