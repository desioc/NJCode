import java.io.*;

public class Exam implements Externalizable {
    private static final long serialVersionUID = 8848963813726842888L;

    private float score;
    private String result;

    public Exam() {
    }

    public Exam(float score) {
        if (score < 0 || score >100) {
            throw new IllegalArgumentException("Score not valid");
        }
        this.score = score;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void writeExternal(ObjectOutput outStream) throws IOException {
        outStream.writeObject(score);
        result =  (score > 64) ?"Passed":"Not Passed";
        outStream.writeObject(result);

    }
    public void readExternal(ObjectInput inStream) throws IOException, ClassNotFoundException {
        score = (int)((Float)inStream.readObject()).floatValue();
        result = (String)inStream.readObject();
    }

    public String toString() {
        return"Exam:\t"+ result +"\nScore\t"+ score;
    }
}