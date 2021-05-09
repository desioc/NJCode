public class PolyExpression1 {
    public static void main(String args[]) {
        String integer = "2" ;
        var index = switch(integer) {
            case "1" -> {
                byte b = 1;
                System.out.println();
                yield b;
            }
            case "2" -> {
                short s = 2;
                yield s;
            }
            case "3" -> 3;
            default -> "-1";
        } ;
        int i = index;
        System.out.println();
    }
}