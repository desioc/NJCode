import java.io.*;

public class CloseResources {
    public static void copyFile(String source, String destination)  throws  FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination);
        try {
            byte[] byteBuffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(byteBuffer)) >= 0)
            outputStream.write(byteBuffer, 0, bytesRead);
        } finally {
            outputStream.close();
            inputStream.close();
        }
    }
}