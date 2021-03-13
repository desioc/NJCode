import java.awt.*;
import javax.swing.*;

public class PaintingCanvas {
    public static void main(String[] args) {
        new PaintingCanvas();
    }
    public PaintingCanvas() {
        Frame frame = new Frame();
        frame.add(new MyCanvas());
        int frameWidth = 300;
        int frameHeight = 300;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }
}

class MyCanvas extends Canvas {
    public void paint(Graphics g) {
        this.setForeground(Color.white);
        this.setBackground(Color.blue);
        int x = 0;
        int y = 0;
        int width = getSize().width-1;
        int height = getSize().height-1;
        g.fillOval(x, y, width, height);
    }
}