public class CounterThread extends Thread {
  public static void main(String args[])
  {
    new CounterThread().start();
  }
   public void run() {
     for (int i = 0; i<10; ++i)
       System.out.println(i);
     }
}