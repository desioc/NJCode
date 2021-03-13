import java.util.function.BiFunction;
public class TestBiFunction {
    public static void main(String args[]) {
        BiFunction<String,String,String> concatenazioneConTrattino = (String s1, String s2) -> { return s1 + "-" + s2; };
        System.out.println(concatenaConTrattino("Andrea","Simone",concatenazioneConTrattino));
    }

    public static String concatenaConTrattino(String s1, String s2, BiFunction<String, String, String> biFunction) {
        return biFunction.apply(s1,s2);
    }
}