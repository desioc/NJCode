public class LocalVariables {
    public static void main(String args[]) {
        System.out.println(new LocalVariables().finalLocalVariablesMethod(5,6));
    }
    public int finalLocalVariablesMethod(final int i,final int j) {
        final int k = i + j;
        return k;
    }
}