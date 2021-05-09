public class AndOrXor {
    public static void main(String args[]) {
        boolean and = true & false;    // and � false
        System.out.println(and);
        boolean or = and | !false;       // or � true
        System.out.println(or);
        boolean xor = and ^ or;        // xor � true
        System.out.println(xor);
        and = or & xor;                       // and � true
        System.out.println(and);
        or = !(xor | and);                   // or � false
        System.out.println(or);
        xor = (and ^ !or);                    // xor � false;
        System.out.println(xor);
    }
}