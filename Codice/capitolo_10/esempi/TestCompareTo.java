public class TestCompareTo {
    public static void main(String args[]) {
        Integer int1 = 4;
        Integer int2 = 5;
        Integer int3 = 5;
        System.out.println(int1.compareTo(int2));
        System.out.println(int2.compareTo(int1));
        System.out.println(int2.compareTo(int3));
    }
}