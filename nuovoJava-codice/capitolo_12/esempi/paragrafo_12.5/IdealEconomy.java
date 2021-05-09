public class IdealEconomy {
  public static void main(String args[]) {
    WareHouse wareHouse = new WareHouse();
    new Producer(wareHouse);
    new Consumer(wareHouse);
  }
}