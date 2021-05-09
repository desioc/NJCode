public class BadWareHouse implements GeneralWareHouse{
  int numberOfProducts;
  int idNumber;
  public synchronized void put(int idNumber) {
    this.idNumber = idNumber;
    numberOfProducts++;
    printSituation("Produced " + idNumber);
  }
  public synchronized int get() {
    numberOfProducts--;
    printSituation("Consumed " + idNumber);
    return idNumber;
  }
  synchronized void printSituation(String msg) {
    System.out.println(msg +"\n" + numberOfProducts + " Product in Warehouse");
  }
}