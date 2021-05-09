import javax.swing.*;
import java.awt.*;

public class SwingExample {
    private JFrame frame;
    private JLabel label;

    public SwingExample() {
        frame = new JFrame("Swing Example");
        label = new JLabel("Take The Time", JLabel.CENTER);
        setup();
        addDetails();
    }

    final void setup() {
        /* Container contentPane = frame.getContentPane();
        contentPane.add(label, BorderLayout.CENTER); */
        frame.add(label, BorderLayout.CENTER);
    }

    final void addDetails() {
        frame.setSize(280,60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new SwingExample());
        /* SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingExample();
            }
        } ); */
    }
}