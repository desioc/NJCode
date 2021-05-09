import java.awt.*;
import javax.swing.*;

public class AWTGUI {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Label l = new Label("AWT", Label.CENTER);
        frame.add(l);
        frame.pack();
        frame.setVisible(true);
    }
}