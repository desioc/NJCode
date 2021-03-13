import java.awt.*;

public class FlowLayoutExample {
    public static void main(String args[]) {
        Frame f = new Frame("FlowLayout");
        Panel p = new Panel();
        Button button1 = new Button("Java");
        Button button2 = new Button("Windows");
        Button button3 = new Button("Motif");
        p.add(button1);
        p.add(button2);
        p.add(button3);
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
}