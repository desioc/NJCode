import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFileWithNIO {
    public static void main(String[] args) {
        String path = "C:\\Windows\\DPINST.LOG";
        try (FileInputStream fis = new FileInputStream(path);
        FileChannel fileChannel = fis.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(128);
            int bytesRead = fileChannel.read(buffer);
            while (bytesRead != -1) {
                System.out.println("Letto: " + bytesRead);
                //converte il buffer da buffer di scrittura a buffer di lettura
                buffer.flip();
                // Stampa byte letti
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear();
                bytesRead = fileChannel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}