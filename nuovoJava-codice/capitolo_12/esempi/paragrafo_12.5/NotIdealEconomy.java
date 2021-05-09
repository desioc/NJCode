public class NotIdealEconomy {
  public static void main(String args[]) {
    BadWareHouse wareHouse = new BadWareHouse();
    new Producer(wareHouse);
    new Consumer(wareHouse);
  }
}