import java.io.*;

public class SerializeExamObject {
    public static void main (String args[]) throws IOException {
        var exam = new Exam (75.F);
        try (var f = new FileOutputStream (new File("exam.ser"));
              var s = new ObjectOutputStream(f);) {
            s.writeObject(exam);
            System.out.println("Exam serialized with Externalizable!");
        } 
    }
}