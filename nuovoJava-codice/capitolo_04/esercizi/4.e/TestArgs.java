public class TestArgs {
    public static void main(String args[]) {
        if (args.length == 1) {
            System.out.println(args[0]);
        } else {
            System.out.println("Specificare un valore da riga di comando");
        }
    }
}