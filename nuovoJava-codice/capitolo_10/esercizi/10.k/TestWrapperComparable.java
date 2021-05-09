import java.util.Arrays;

public class TestWrapperComparable {
    public static void main(String args[]) {
        WrapperComparable[] array = {new WrapperComparable(1942), new WrapperComparable(1974), new WrapperComparable(1907)};
        Arrays.sort(array);
        for (WrapperComparable wrapperComparable : array) {
            System.out.println(wrapperComparable);
        }
    }
}
