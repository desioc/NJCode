public class VarForTest {
    public static void main(String args[]) {
        String [] strings  = {"Antonio", "Ludwig", "Johann Sebastian", "Piotr", "Fryderyk", "Frank Joseph", "Claude", "Giacomo","Maurice"};
        for (var i = 0; i < strings.length; i++) {
           System.out.println(strings[i]);
        }
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (final var tmp : arr) {
            System.out.println(tmp);
        }
    }
}