public class LocalMethodReferenceTypeInferenceTest {
    public static void main(String args[]) {
        Print print = System.out::print;
//        var print = System.out::print;
    }
}