import java.nio.file.*;
import java.net.*;

public class PathMethods {
    public static void main(String args[]) {
        Path pathToTest = Path.of("C:\\", "\\Test");
        System.out.println("Path.of(String first, String... more): " + pathToTest);
        try {
            Path pathToThisFile = Path.of(new URI("file:///PathMethods.java"));
            System.out.println("Path.of(URI uri): " + pathToThisFile);
        }
        catch (URISyntaxException exc) {
            exc.printStackTrace();
        }
        //Path pathToImaginaryFile = Paths.get("ImaginaryRoot-imaginaryFolder-..-.-..-imaginaryFile");
        //System.out.println("toString: "+pathToImaginaryFile.toString());
        Path pathToDesktop = Paths.get("C:\\Users\\user\\.\\Desktop");
        Path pathToDocuments = Paths.get("C:\\Users\\user\\Documents");
        System.out.println("toString: "+ pathToDesktop.toString());
        System.out.println("toString: "+ pathToDocuments.toString());       
        System.out.println("getFileName: "+ pathToDesktop.getFileName());
        System.out.println("getRoot: "+ pathToDesktop.getRoot());
        System.out.println("getNameCount: "+ pathToDesktop.getNameCount());
        System.out.println("getName(0): "+ pathToDesktop.getName(0));
        System.out.println("subpath(0,2): "+ pathToDesktop.subpath(0,2));
        System.out.println("getParent: "+ pathToDesktop.getParent());
        System.out.println("toUri: "+ pathToDesktop.toUri());
        System.out.println("pathToDesktop.startsWith: "+  pathToDesktop.startsWith(pathToDocuments.subpath(0,2)));
        System.out.println("pathToDesktop.endsWith: "+ pathToDesktop.endsWith(pathToDocuments.subpath(0,2)));
        System.out.println("path from p1 to p2: "+ pathToDesktop.relativize(pathToDocuments));
        System.out.println("path from p2 to p1: "+  pathToDocuments.relativize(pathToDesktop));
        System.out.println("pathToDesktop.equals(pathToDocuments): "+ pathToDesktop.equals(pathToDocuments));
    }
}