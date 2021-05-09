public class EsercizioFF {
    public static void main(String args[]) {
       String stringa1 = "123789";
       String stringa2 = stringa1.concat(System.lineSeparator());
       char [] array1 = stringa2.toCharArray();
       char [] array2 = {'4', '5', '6'};
       System.arraycopy(array2, 0, array1, 3, 3);
       System.out.println(array1);
       System.exit(0);
    }
}