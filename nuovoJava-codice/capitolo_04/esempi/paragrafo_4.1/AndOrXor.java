public class AndOrXor {
    public static void main(String args[]) {
        boolean and = true & false;    // and è false
        System.out.println(and);
        boolean or = and | !false;       // or è true
        System.out.println(or);
        boolean xor = and ^ or;        // xor è true
        System.out.println(xor);
        and = or & xor;                       // and è true
        System.out.println(and);
        or = !(xor | and);                   // or è false
        System.out.println(or);
        xor = (and ^ !or);                    // xor è false;
        System.out.println(xor);
    }
}