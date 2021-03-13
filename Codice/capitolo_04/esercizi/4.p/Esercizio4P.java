public class Esercizio4P {
    public static void main(String args[]) {
        int i = 22;
        int j = i++%3;
        i = j!=0?j:i;
        switch (i) {
            case 1:
            System.out.println(8<<2);
            case 0:
            System.out.println(8>>2);
            break;
            case 2:
            System.out.println(i!=j);
            break;
            case 3:
            System.out.println(++j);
            break;
            default:
            System.out.println(i++);
            break;
        }
    }
}