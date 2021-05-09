import java.io.*;

public class CloseTryWithResources {
    public static void copyFile(String source, String destination) throws FileNotFoundException, IOException {
        try (InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination)) {
            byte[] byteBuffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(byteBuffer)) >= 0)
            outputStream.write(byteBuffer, 0, bytesRead);
        }
    }
}