public class TestIDE {
    public static void main(String args[]) {
        IDE ide = new JavaIDE();
        FileSorgente fileSorgente = new FileSorgente("Test.java",
            File.TipoFile.JAVA, "public class MyClass {\n\r");
        ide.modifica(fileSorgente, "}");
    }
}