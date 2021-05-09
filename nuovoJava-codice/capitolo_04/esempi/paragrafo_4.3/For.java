public class For {
  public static void main(String args[]) {
    for (int i = 0, j = 10; i < 5 || j > 5; i++, j--, System.out.println("aggiornamento")) {
      System.out.println("i="+i);
      System.out.println("j="+j);
    }
  }
  
}