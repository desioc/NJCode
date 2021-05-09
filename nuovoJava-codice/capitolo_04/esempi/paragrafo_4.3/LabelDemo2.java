public class LabelDemo2 {
    public static void main(String args[]) {
        int j = 1;
        labelPerBloccoDiCodice: //possiamo dare un qualsiasi nome ad una label
        {
            while (true) {
                if (j > 10)
                break labelPerBloccoDiCodice;
                System.out.println(j);
                j++;
            }
        //    System.out.println("Questo non verrà mai stampato!");
        }
        labelPerStatement:break labelPerStatement;
    }
}