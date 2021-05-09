public class EsercizioFG {
    public static void main(String args[]) throws CloneNotSupportedException {
        TestoRTF testoRTF1 = new TestoRTF("Java", Font.ARIAL, false);
        System.out.println(testoRTF1);
        System.out.println(testoRTF1.clone());
    }
}