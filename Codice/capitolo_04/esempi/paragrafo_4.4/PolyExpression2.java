public class PolyExpression2 {
    public static void main(String args[]) {
        PolyExpression2 po2 = new PolyExpression2();
        String integer ="2";
        po2.method(
            switch(integer) {
                case "1"-> {
                    byte b = 1;
                    yield b;
                }
                case "2"-> {
                    short s = 2;
                    yield s;
                }
                case "3"-> 3;
                default -> -1;
            }
        );
    }
    public void method(int index) {
        System.out.println(index);
    }
}