import java.awt.*;
public class FinestraConBottone {
    public static void main(String args[]) {
        Frame finestra = new Frame("Titolo");
        Button bottone = new Button("Cliccami");
        finestra.add(bottone);
        finestra.setSize(200,100);
        finestra.setVisible(true);
    }
}