public class ForEachDemo {
    public static void main(String args[]) {
        int [] arr = {
            0,1,2,3,4,5,6,7,8,9
        } ;
        for (/* final */int tmp : arr) {
            System.out.println(tmp);
        }
    }
}