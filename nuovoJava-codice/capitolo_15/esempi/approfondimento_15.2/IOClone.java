import java.io.*;

public class IOClone {
    public static <O extends Serializable> O cloneObject(O object) throws IOException, ClassNotFoundException {
        if (object == null) {
            return null;
        }
        O objectCloned;
        try (ByteArrayOutputStream bout = new ByteArrayOutputStream();
              ObjectOutputStream out = new ObjectOutputStream(bout)) {
            out.writeObject(object);
            out.flush();
            try (ByteArrayInputStream bais = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bais)) {
                objectCloned = (O) in.readObject();
            }
        }
        return objectCloned;
    }
}