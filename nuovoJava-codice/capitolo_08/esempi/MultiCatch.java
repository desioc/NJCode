import java.io.*;

public class MultiCatch {
    public static void main(String args[]) {
        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException /*|  IOException */exc) {
            exc.printStackTrace();
        }
    }
}