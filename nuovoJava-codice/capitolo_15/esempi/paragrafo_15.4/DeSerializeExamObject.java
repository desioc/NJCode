import java.io.*;

public class DeSerializeExamObject {
    public static void main (String args[]) throws Exception {
        Exam exam = null;
        try (var f = new FileInputStream (new File("exam.ser"));
              var s = new ObjectInputStream (f);) {
            exam = (Exam)s.readObject();
            System.out.println("Object deserialized!");
            System.out.println(exam);
        }
    }
}